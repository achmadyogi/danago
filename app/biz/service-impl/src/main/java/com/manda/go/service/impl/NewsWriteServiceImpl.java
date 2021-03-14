/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.manda.go.service.impl;

import java.sql.SQLException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import com.manda.go.common.dal.dai.MissionManageDAO;
import com.manda.go.common.dal.dao.MissionDO;
import com.manda.go.facade.NewsWriteService;

/**
 * @author qilong.zql
 * @since 2.5.0
 */
@MapperScan("com.manda.go.common.dal.dai")
public class NewsWriteServiceImpl implements NewsWriteService {

    @Autowired
    MissionManageDAO missionManageDAO;

    @Override
    public String myNews() {
        MissionDO missionDO = missionManageDAO.findById(1);
        return "Yes, its me!" + missionDO.getProductCode();
    }

    @Override
    public int addNews(String author, String title) throws SQLException {
//        try {
//            NewsDO newDO = new NewsDO();
//            newDO.setAuthor(author);
//            newDO.setTitle(title);
//            return newManageDao.insert(newDO);
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//            throw ex;
//        }
        return 0;
    }

    @Override
    public void deleteNews(String author) throws SQLException {
//        try {
//            newManageDao.delete(author);
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//            throw ex;
//        }
    }
}