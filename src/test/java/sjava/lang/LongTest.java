/*
 * Copyright 2015 FraudMetrix.cn All right reserved. This software is the
 * confidential and proprietary information of FraudMetrix.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with FraudMetrix.cn.
 */
package sjava.lang;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Test for {@link Long}.
 * 
 * @author huagang.li 2015年1月5日 上午11:52:06
 */
public class LongTest {

    @Test(dataProvider = "parseLong")
    public void parseLong(String s, long expected) {
        assertEquals(Long.parseLong(s), expected);
    }

    @DataProvider(name = "parseLong")
    protected static final Object[][] parseLongTestData() {
        Object[][] testData = new Object[][] {//
                                              //
                { "-1", -1L },//
                { "0", 0L },//
                { "1", 1L },//
        };
        return testData;
    }

}
