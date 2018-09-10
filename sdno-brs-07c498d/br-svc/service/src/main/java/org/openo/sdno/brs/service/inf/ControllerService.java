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

package org.openo.sdno.brs.service.inf;

import org.openo.baseservice.remoteservice.exception.ServiceException;
import org.openo.sdno.brs.model.ControllerMo;
import org.openo.sdno.framework.container.service.IService;

/**
 * controller management service.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-6-3
 */
public interface ControllerService extends IService {

    /**
     * <br>
     * 
     * @param objectId UUID of controller.
     * @return controller of the given UUID.
     * @throws ServiceException if exception happens in DB.
     * @since SDNO 0.5
     */
    ControllerMo queryController(String objectId) throws ServiceException;

    /**
     * add controller.<br>
     * 
     * @param controller controller to add.
     * @return UUID of the given controller.
     * @throws ServiceException if exception happens in DB.
     * @since SDNO 0.5
     */
    String addController(ControllerMo controller) throws ServiceException;

    /**
     * delete controller by UUID.<br>
     * 
     * @param objectId UUID of controller.
     * @throws ServiceException if exception happens in DB.
     * @since SDNO 0.5
     */
    void deleteController(String objectId) throws ServiceException;

    /**
     * update controller.<br>
     * 
     * @param objectId UUID of controller.
     * @param controller the controller information to update.
     * @throws ServiceException if exception happens in DB.
     * @since SDNO 0.5
     */
    void modifyController(String objectId, ControllerMo controller) throws ServiceException;

}
