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

package org.openo.sdno.mss.model.util;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import mockit.Mock;
import mockit.MockUp;

/**
 * SaxParserFactories test class. <br/>
 * 
 * @author
 * @version SDNO 0.5 2016-3-26
 */
public class SaxParserFactoriesTest {

    @SuppressWarnings("restriction")
    @Test
    public void testNewSecurityInstance() {
        new MockUp<com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl>() {

            @Mock
            public void setFeature(String name, boolean value)
                    throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
                throw new ParserConfigurationException();
            }
        };

        SaxParserFactories.newSecurityInstance();
    }

}
