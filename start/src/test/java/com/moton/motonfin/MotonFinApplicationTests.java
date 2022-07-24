package com.moton.motonfin;

import com.moton.motonfin.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MotonFinApplicationTests {

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
