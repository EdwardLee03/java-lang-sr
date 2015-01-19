/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sjava.lang;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests for {@link Integer}.
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
