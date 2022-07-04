package com.moton.motonfin;

/**
 * @author daiweihang
 * @date 2022/7/2
 */
public class SimpleBean {
    private String name;

    public SimpleBean(String name) {
        this.name = name;
    }

    public SimpleBean() {
        System.out.println("启动啦无参构造器");
    }
}
