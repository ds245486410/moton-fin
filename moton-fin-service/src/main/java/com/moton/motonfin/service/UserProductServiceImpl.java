package com.moton.motonfin.service;

import com.moton.motonfin.api.UserProductService;
import com.moton.motonfin.api.UserService;
import com.moton.motonfin.api.base.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author daiweihang
 * @date 2022/8/7
 */
@Product
public class UserProductServiceImpl implements UserProductService {
    @Resource
    private UserService userService;
    @Override
    public void queryProduct(Long id) {
        System.out.println("UserProductServiceImpl+"+id);

    }
}
