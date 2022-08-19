package com.moton.motonfin.manager.eventbus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
@Configuration
@Slf4j
public class EventConfig implements InitializingBean , DisposableBean {

    @Autowired
    private List<EventAdapter> list;

    @Override
    public void destroy() throws Exception {
        for (EventAdapter eventAdapter : list) {
            EventHandler.unRegister(eventAdapter);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (EventAdapter eventAdapter : list) {
            EventHandler.register(eventAdapter);
        }
    }
}
