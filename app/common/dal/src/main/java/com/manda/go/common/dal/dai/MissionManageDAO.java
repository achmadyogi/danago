/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dai;

import com.manda.go.common.dal.dao.MissionDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionManageDAO.java, v 0.1 2021‐03‐14 15.02 Achmad Yogi Prakoso Exp $$
 */
public interface MissionManageDAO {
    String findById = "SELECT * FROM missions WHERE id = #{id}";
    @Select(findById)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "productCode", column = "product_code")
    })
    MissionDO findById(@Param("id") int id);
}
