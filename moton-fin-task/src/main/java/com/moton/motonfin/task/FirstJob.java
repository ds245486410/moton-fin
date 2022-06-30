package com.moton.motonfin.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;

/**
 * @author daiweihang
 * @date 2022/6/20
 */
@Slf4j
public class FirstJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
       log.info("job 运行{}",shardingContext.toString());
    }
}
