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

package sjava.lang.benchmark;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Benchmark Tests for {@link StringBuilder} and {@link StringBuffer}.
 * 
 * @author huagang.li 2015年1月19日 下午1:08:36
 */
public class StringAppendTest {

    private static final Logger logger = LoggerFactory.getLogger(StringAppendTest.class);

    @Test(description = "StringBuilder 和 StringBuffer 的 append 操作的性能对比")
    public void append() throws IOException {
        // StringBuilder
        append(new StringBuilder());

        // StringBuffer
        append(new StringBuffer());
    }

    private static void append(Appendable appendable) {
        String str = "0123456789";
        TestScale testScale = TestScale.Large;

        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0, size = testScale.value(); i < size; i++) {
            builder.append(str);
        }
        long runTime = System.currentTimeMillis() - startTime;
        logger.info("{}'s append time: {}, test scale: {}", appendable.getClass().getSimpleName(), runTime, testScale);
    }

}
