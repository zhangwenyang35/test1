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

package org.openo.sdno.mss.dao.exception;

import org.openo.sdno.mss.dao.entities.InvRespEntity;

/**
 * <br>
 * Response Entity Exception Interface.
 * <p>
 * </p>
 * 
 * @author
 * @version SDNO 0.5 May 20, 2016
 */
public interface IRespEntityException {

    /**
     * Get Entity Interface.<br>
     * 
     * @return Entity Object
     * @since SDNO 0.5
     */
    InvRespEntity<Object> getEntity();
}
