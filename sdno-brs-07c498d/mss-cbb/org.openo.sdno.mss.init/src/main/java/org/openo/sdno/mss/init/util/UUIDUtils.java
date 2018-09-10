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

import java.util.UUID;

/**
 * UUID utility class, used to create a UUID. <br>
 * 
 * @author
 * @version SDNO 0.5 2016-3-26
 */
public class UUIDUtils {

    private UUIDUtils() {

    }

    /**
     * Create UUID, not case sensitive in windows, in the style like:
     * a12e7652-4b11-4c28-8158-82f4082b3e2b <br>
     * 
     * @return the created UUID.
     * @since SDNO 0.5
     */
    public static String createUuid() {
        return UUID.randomUUID().toString();
    }
}
