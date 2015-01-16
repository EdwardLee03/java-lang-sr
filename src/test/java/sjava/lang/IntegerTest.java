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
 * Test for {@link Integer}.
 * 
 * @author huagang.li 2015年1月5日 下午12:03:13
 */
public class IntegerTest {

    @Test(dataProvider = "parseInt")
    public void parseInt(String s, int expected) {
        assertEquals(Integer.parseInt(s), expected);
    }

    @DataProvider(name = "parseInt")
    protected static final Object[][] parseIntTestData() {
        Object[][] testData = new Object[][] {//
                                              //
                { "-1", -1 },//
                { "0", 0 },//
                { "1", 1 },//
                { "2", 2 },//
                { "8", 8 },//
                { "100", 100 },//
        };
        return testData;
    }

}
