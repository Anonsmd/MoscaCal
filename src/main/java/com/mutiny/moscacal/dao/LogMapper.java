package com.mutiny.moscacal.dao;

import com.mutiny.moscacal.pojo.Log;
import com.mutiny.moscacal.pojo.LogExample;
import java.util.List;

public interface LogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int insert(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int insertSelective(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    List<Log> selectByExample(LogExample example);
}