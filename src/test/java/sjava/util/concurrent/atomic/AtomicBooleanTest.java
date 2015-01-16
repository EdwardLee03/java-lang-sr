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

package sjava.util.concurrent.atomic;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.atomic.AtomicBoolean;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * UT for {@link AtomicBoolean}.
 * 
 * @author huagang.li 2015年1月16日 下午7:12:38
 */
public class AtomicBooleanTest {

    @Test(dataProvider = "compareAndSet")
    public void compareAndSet(boolean initialValue, boolean update, boolean expected) {
        AtomicBoolean atomic = new AtomicBoolean(initialValue);
        atomic.compareAndSet(initialValue, update);
        assertEquals(atomic.get(), expected);
    }

    @DataProvider(name = "compareAndSet")
    protected static final Object[][] compareAndSetTestData() {
        Object[][] testData = new Object[][] {//
                                              //
                { false, true, true }, //
                { true, false, false }, //
        };
        return testData;
    }

}
