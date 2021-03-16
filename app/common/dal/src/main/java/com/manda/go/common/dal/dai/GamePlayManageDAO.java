/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dai;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: GamePlayManageDAO.java, v 0.1 2021‐03‐14 19.58 Achmad Yogi Prakoso Exp $$
 */
public interface GamePlayManageDAO {
    String playCount = "SELECT COUNT(user_id) AS amount FROM game_plays "
                       + "WHERE user_id = #{userId} AND DATE(created_date) >= DATE(NOW())";

    @Select(playCount)
    @Results(value = { @Result(property = "amount", column = "amount") })
    int dailyGameCount(@Param("userId") String userId);
}
