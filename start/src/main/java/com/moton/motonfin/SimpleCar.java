package com.moton.motonfin;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author daiweihang
 * @date 2022/7/5
 */
@Getter@Setter
//@Service
public class SimpleCar {
    private SimpleBean simpleBean;

    public SimpleCar(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public void getSimpleInfo(){
        System.out.println("张三");
    }
}
