package com.moton.motonfin.manager.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import lombok.extern.slf4j.Slf4j;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
@SuppressWarnings("ALL")
@Slf4j
public class EventHandler {
    private static final EventBus eventbus = new AsyncEventBus(EventExecutor.createExecutor());

    public static void register(EventAdapter eventAdapter){
        log.info("{} event register",eventAdapter);
        eventbus.register(eventAdapter);
    }
    public static void post(Object object){
        log.info("{} post",object);
        eventbus.post(object);
    }
    public static void unRegister(EventAdapter eventAdapter){
        log.info("{} event unRegister",eventAdapter);
    }
}
