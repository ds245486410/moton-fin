package com.moton.motonfin.manager.eventbus.impl;

import com.moton.motonfin.manager.eventbus.LoanSuccessListener;
import com.moton.motonfin.manager.eventbus.event.LoanSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
@Component@Slf4j
public class MessageLoanSuccessListener implements LoanSuccessListener  {
    @Override
    public void subscribe(LoanSuccessEvent event) {
        log.info("发送用款成功消息");
    }
}
