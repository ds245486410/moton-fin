package com.moton.motonfin.manager.eventbus;

import com.google.common.base.Joiner;
import com.google.common.util.concurrent.MoreExecutors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
@Slf4j
@SuppressWarnings("ALL")
public class EventExecutor {
    private static ThreadPoolExecutor threadPoolExecutor;

    private static void init(final String namingPattern , final int threadSize){
        log.info("create event threadPoolExecutor");
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(300000);
        threadPoolExecutor = new ThreadPoolExecutor(threadSize , threadSize , 5L , TimeUnit.MINUTES ,workQueue,
                new BasicThreadFactory.Builder().namingPattern(Joiner.on("-").join(namingPattern,"%s")).build(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);

    }

    public static ExecutorService createExecutor(){
        init("event-handler", 5);
        return MoreExecutors.listeningDecorator(MoreExecutors.getExitingExecutorService(threadPoolExecutor));
    }
}
