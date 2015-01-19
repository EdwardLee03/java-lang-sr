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

/**
 * "测试规模"表示类。
 * 
 * @author huagang.li 2015年1月19日 下午2:08:24
 */
public enum TestScale {
    Large(1000 * 10000, "大规模测试样本数"), //
    MIDDLE(500 * 10000, "中等规模测试样本数"), //
    ;

    private final int    value;
    private final String message;

    public final int value() {
        return value;
    }

    public final String message() {
        return message;
    }

    @Override
    public String toString() {
        return this.name() + '(' + value + ", " + message + ')';
    }

    private TestScale(int value, String message){
        this.value = value;
        this.message = message;
    }

}
