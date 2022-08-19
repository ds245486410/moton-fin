package com.moton.motonfin.event;

import com.moton.motonfin.MotonFinApplicationTests;
import com.moton.motonfin.manager.eventbus.EventHandler;
import com.moton.motonfin.manager.eventbus.event.LoanSuccessEvent;
import org.junit.jupiter.api.Test;

/**
 * @author daiweihang
 * @date 2022/8/19
 */
public class EventTest extends MotonFinApplicationTests {

    @Test
    public void test(){
        EventHandler.post(new LoanSuccessEvent());
    }

}
