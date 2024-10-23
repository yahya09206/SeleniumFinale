package com.yahya.tests.day10_driver_method;

import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login();
    }
}
