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
package com.manda.go.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.manda.go.facade.NewsReadService;
import com.manda.go.facade.NewsWriteService;
import com.manda.go.facade.UserServiceFacade;
import com.manda.go.request.UserInquiryRequest;
import com.manda.go.response.UserInquiryResult;

/**
 * @author qilong.zql
 * @since 2.5.8
 */
@RestController
public class SampleRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestController.class);

    @SofaReference
    private DataSource       dataSource;

    @SofaReference
    private NewsReadService newReadService;

    @SofaReference
    private NewsWriteService newWriteService;

    @SofaReference
    private UserServiceFacade   userServiceFacade;

    @PostMapping("/danago/userInquiry")
    @ResponseBody
    public UserInquiryResult userInquiry(@RequestBody UserInquiryRequest userInquiryRequest) {
        UserInquiryResult result;
        try {
            result = userServiceFacade.userInquiry(userInquiryRequest);
        } catch (Exception e) {
            // Create result
            result = new UserInquiryResult();
            result.setSuccess(false);
            LOGGER.error(e.getMessage());
        }
        return result;
    }

    /**
     * Create a news table
     * @return
     */
    @RequestMapping("/create")
    public Map<String, Object> create() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            st.execute("DROP TABLE IF EXISTS NewsTable;"
                       + "CREATE TABLE NewsTable(ID INT AUTO_INCREMENT, PRIMARY KEY (ID), AUTHOR VARCHAR(50),TITLE VARCHAR(255));");
            resultMap.put("success", true);
            resultMap
                .put(
                    "result",
                    "CREATE TABLE NewsTable(ID INT AUTO_INCREMENT, PRIMARY KEY (ID), AUTHOR VARCHAR(50), TITLE VARCHAR(255))");
        } catch (Throwable throwable) {
            resultMap.put("success", false);
            resultMap.put("error", throwable.getMessage());
        }
        return resultMap;
    }

    @RequestMapping("/insert/{author}/{title}")
    public Map<String, Object> insert(@PathVariable("author") String author,
                                      @PathVariable("title") String title) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            newWriteService.addNews(author, title);
            resultMap.put("success", true);
        } catch (Throwable throwable) {
            resultMap.put("success", false);
            resultMap.put("error", throwable.getMessage());
        }
        return resultMap;
    }

    @RequestMapping("/delete/{author}")
    public Map<String, Object> delete(@PathVariable("author") String author) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            newWriteService.deleteNews(author);
            resultMap.put("success", true);
        } catch (Throwable throwable) {
            resultMap.put("success", false);
            resultMap.put("error", throwable.getMessage());
        }
        return resultMap;
    }

    @RequestMapping("/query/{author}")
    public Map<String, Object> query(@PathVariable("author") String author) {
//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        try {
//            List<NewsDO> ret = newReadService.read(author);
//            resultMap.put("success", true);
//            resultMap.put("count", ret.size());
//            int i = 0;
//            for (NewsDO newDO : ret) {
//                resultMap.put(String.valueOf(++i), newDO.getAuthor() + "-" + newDO.getTitle());
//            }
//        } catch (Throwable throwable) {
//            resultMap.put("success", false);
//            resultMap.put("error", throwable.getMessage());
//        }
//        return resultMap;
        return null;
    }

    @RequestMapping("/json")
    public String sampleController() {
        return newWriteService.myNews();
    }

}