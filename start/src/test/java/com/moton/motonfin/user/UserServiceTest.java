package com.moton.motonfin.user;

import com.moton.motonfin.MotonFinApplicationTests;
import com.moton.motonfin.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author daiweihang
 * @date 2022/7/26
 */
@Slf4j
public class UserServiceTest extends MotonFinApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testQuery(){
        String userName = userService.getUserName(1L);
        log.info("用户名:{}",userName);
    }
}
