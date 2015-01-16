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
 * Test for {@link Boolean}.
 * 
 * @author huagang.li 2015年1月5日 上午11:58:01
 */
public class BooleanTest {

    @Test(dataProvider = "parseBoolean")
    public void parseBoolean(String s, boolean expected) {
        assertEquals(Boolean.parseBoolean(s), expected);
    }

    @DataProvider(name = "parseBoolean")
    protected static final Object[][] parseBooleanTestData() {
        Object[][] testData = new Object[][] {//
                                              //
                { "true", true },//
                { "false", false },//
        };
        return testData;
    }
}
