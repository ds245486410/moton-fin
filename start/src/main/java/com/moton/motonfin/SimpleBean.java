package com.moton.motonfin;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author daiweihang
 * @date 2022/7/2
 */
@Lazy
public class SimpleBean {
    private String name;

    public SimpleBean(String name) {
        this.name = name;
    }

    public SimpleBean() {
        System.out.println("启动啦无参构造器");
    }
}
