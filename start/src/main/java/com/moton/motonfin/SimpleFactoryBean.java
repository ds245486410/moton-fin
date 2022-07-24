package com.moton.motonfin;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author daiweihang
 * @date 2022/7/5
 */
public class SimpleFactoryBean implements FactoryBean<SimpleBean> {
    @Override
    public SimpleBean getObject() throws Exception {
        return new SimpleBean("zhangsan");
    }

    @Override
    public Class<?> getObjectType() {
        return SimpleBean.class;
    }
}
