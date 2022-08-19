package com.moton.motonfin.user;

import com.moton.motonfin.MotonFinApplicationTests;
import com.moton.motonfin.api.UserProductService;
import com.moton.motonfin.service.UserProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author daiweihang
 * @date 2022/8/7
 */
public class UserProductServiceTest extends MotonFinApplicationTests {
    @Autowired
    private UserProductService productService;

    @Test
    public void testQuery(){
        productService.queryProduct(1L);

    }
}
