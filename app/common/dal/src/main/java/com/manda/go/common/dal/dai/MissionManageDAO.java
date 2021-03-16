/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dai;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.manda.go.common.dal.dao.MissionDO;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionManageDAO.java, v 0.1 2021‐03‐14 15.02 Achmad Yogi Prakoso Exp $$
 */
public interface MissionManageDAO {
    String findById = "SELECT * FROM missions WHERE id = #{id}";

    @Select(findById)
    @Results(value = { @Result(property = "id", column = "id"),
                       @Result(property = "productCode", column = "product_code") })
    MissionDO findById(@Param("id") int id);

    @Select({ "<script>", "SELECT *", "FROM missions", "WHERE id IN",
              "<foreach item='item' index='index' collection='items'",
              "open='(' separator=',' close=')'>", "#{item}", "</foreach>", "</script>" })
    @Results(value = { @Result(property = "id", column = "id"),
                       @Result(property = "productCode", column = "product_code"),
                       @Result(property = "title", column = "title"),
                       @Result(property = "description", column = "description"),
                       @Result(property = "category", column = "category"),
                       @Result(property = "serviceUrl", column = "service_url"),
                       @Result(property = "points", column = "points"),
                       @Result(property = "transactionQuantity", column = "transaction_quantity"),
                       @Result(property = "transactionMinAmount", column = "transaction_min_amount"),
                       @Result(property = "level", column = "level"),
                       @Result(property = "createdDate", column = "created_date"),
                       @Result(property = "updatedDate", column = "updated_date") })
    List<MissionDO> findByListIds(@Param("items") List<BigInteger> ids);

}
