package com.moton.motonfin;

import com.moton.motonfin.api.UserService;
import com.moton.motonfin.task.JobConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Slf4j
@ComponentScan(basePackages = "com.moton",excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {JobConfig.class})} )
public class MotonFinApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        String userName = userService.getUserName(1L);
        log.info(userName);

    }

}
