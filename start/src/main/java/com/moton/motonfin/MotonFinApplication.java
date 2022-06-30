package com.moton.motonfin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.moton")
public class MotonFinApplication {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SpringApplication.run(MotonFinApplication.class, args);
        stopWatch.stop();
        log.info("交易时间：{}" + stopWatch.prettyPrint());
    }

}
