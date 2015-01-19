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
 * Tests for {@link Boolean}.
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
