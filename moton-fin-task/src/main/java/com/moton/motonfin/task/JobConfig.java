package com.moton.motonfin.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.api.JobConfiguration;
import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.ScheduleJobBootstrap;
import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperConfiguration;
import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author daiweihang
 * @date 2022/6/20
 */
@Configuration
@Slf4j
public class JobConfig  {

    @Value("${first.job.cron}")
    private String firstJobCron;
    @Value("${zk.url}")
    private String zkUrl;
    private final static String NAME_SPACE = "elastic-job";



    @PostConstruct
    public void initJobConfig(){
        log.info("job的初始化类执行了");
        new ScheduleJobBootstrap(createRegistryCenter(), new FirstJob(), createJobConfiguration()).schedule();
    }



    private  CoordinatorRegistryCenter createRegistryCenter() {
        CoordinatorRegistryCenter regCenter = new ZookeeperRegistryCenter(new ZookeeperConfiguration(zkUrl, NAME_SPACE));
        regCenter.init();
        return regCenter;
    }

    private  JobConfiguration createJobConfiguration() {
        JobConfiguration jobConfig = JobConfiguration.newBuilder("FirstJob", 3).misfire(true).cron(firstJobCron).build();
        return jobConfig;
    }
}


