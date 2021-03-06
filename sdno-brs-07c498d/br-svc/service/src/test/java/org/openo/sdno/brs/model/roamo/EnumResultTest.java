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

package org.openo.sdno.brs.model.roamo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * EnumResult test class.<br>
 * 
 * @author
 * @version SDNO 0.5 October 11, 2016
 */
public class EnumResultTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetIndex() {
        assertTrue(1 == EnumResult.FAIL.getIndex());
        assertTrue(0 == EnumResult.SUCCESS.getIndex());
    }

    @Test
    public void testGetName() {
        assertTrue("fail".equals(EnumResult.FAIL.getName()));
        assertTrue("success".equals(EnumResult.SUCCESS.getName()));
    }
}
