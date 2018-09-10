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

package org.openo.sdno.mss.bucket.dao.mappers;

import org.openo.sdno.mss.bucket.dao.pojo.RelationPojo;

/**
 * Operation mapper for relation table.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-5-18
 */
public interface RelationMapper {

    /**
     * Delete data by primary key.<br>
     * 
     * @param bktName Bucket name
     * @return The row number just deleted from the database
     * @since SDNO 0.5
     */
    int deleteByPrimaryKey(String bktName);

    /**
     * Add relation data.<br>
     * 
     * @param record New record
     * @return The row number just inserted into the database
     * @since SDNO 0.5
     */
    int insert(RelationPojo record);

    /**
     * Add specified field of relation table.<br>
     * 
     * @param record Relational data record
     * @return The row number just inserted into the database
     * @since SDNO 0.5
     */
    int insertSelective(RelationPojo record);

    /**
     * Query relation data by primary key.<br>
     * 
     * @param bktName Bucket name
     * @return Relational data
     * @since SDNO 0.5
     */
    RelationPojo selectByPrimaryKey(String bktName);

    /**
     * Update specified field of relation data by primary key.<br>
     * 
     * @param record Bucket record
     * @return The row number just updated in the database
     * @since SDNO 0.5
     */
    int updateByPrimaryKeySelective(RelationPojo record);

    /**
     * Update relation data by primary key.<br>
     * 
     * @param record Relational data record
     * @return The row number just updated in the database
     * @since SDNO 0.5
     */
    int updateByPrimaryKey(RelationPojo record);
}
