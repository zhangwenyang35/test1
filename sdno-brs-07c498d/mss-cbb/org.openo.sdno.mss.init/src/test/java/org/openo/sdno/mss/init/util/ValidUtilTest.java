/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.mss.init.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Valid utility test class.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-5-27
 */
public class ValidUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCheckPropertyPrecision() {
        assertTrue(ValidUtil.checkPropertyPrecision(10, 5));
        assertFalse(ValidUtil.checkPropertyPrecision(10, 15));
    }
}
