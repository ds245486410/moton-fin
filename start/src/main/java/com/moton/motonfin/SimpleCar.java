package com.moton.motonfin;

import lombok.Getter;
import lombok.Setter;

/**
 * @author daiweihang
 * @date 2022/7/5
 */
@Getter@Setter
public class SimpleCar {
    private SimpleBean simpleBean;

    public SimpleCar(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
}
