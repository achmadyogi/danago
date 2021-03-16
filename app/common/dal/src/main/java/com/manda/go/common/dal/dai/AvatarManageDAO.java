/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dai;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.manda.go.common.dal.dao.AvatarDO;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: AvatarManageDAO.java, v 0.1 2021‐03‐14 19.57 Achmad Yogi Prakoso Exp $$
 */
public interface AvatarManageDAO {
    String findById = "SELECT * FROM avatars WHERE user_id = #{userId}";

    @Select(findById)
    @Results(value = { @Result(property = "userId", column = "user_id"),
                       @Result(property = "points", column = "points"),
                       @Result(property = "level", column = "level"),
                       @Result(property = "createdDate", column = "created_date"),
                       @Result(property = "updatedDate", column = "updated_date") })
    AvatarDO findById(@Param("userId") String userId);
}
