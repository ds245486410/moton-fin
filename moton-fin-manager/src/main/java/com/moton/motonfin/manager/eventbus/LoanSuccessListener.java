package com.moton.motonfin.manager.eventbus;

import com.google.common.eventbus.Subscribe;
import com.moton.motonfin.manager.eventbus.event.LoanSuccessEvent;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
@SuppressWarnings("ALL")
public interface LoanSuccessListener extends EventAdapter {

    @Subscribe
    void subscribe(LoanSuccessEvent event);
}
