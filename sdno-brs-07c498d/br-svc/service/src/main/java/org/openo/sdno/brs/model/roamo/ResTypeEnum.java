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

/**
 * Enumeration class of resource type.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-5-19
 */
public enum ResTypeEnum {
    SITE("site"), ME("managedelement");

    private String resType;

    ResTypeEnum(String resType) {
        this.resType = resType;
    }

    /**
     * Return the basic resource type(ME, MD, LTP, TP, SITE) of given resType.<br>
     * 
     * @param resType resource type.
     * @return
     * @since SDNO 0.5
     */
    public static ResTypeEnum getValue(String resType) {
        ResTypeEnum[] values = ResTypeEnum.values();
        for(ResTypeEnum value : values) {
            if(value.resType.equals(resType)) {
                return value;
            }
        }

        throw new IllegalArgumentException("invalid restype:" + resType);
    }
}
