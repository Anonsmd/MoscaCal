package com.mutiny.moscacal.dao;

import com.mutiny.moscacal.pojo.KeyFile;
import com.mutiny.moscacal.pojo.KeyFileExample;
import java.util.List;

public interface KeyFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int deleteByPrimaryKey(Integer keyfileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int insert(KeyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int insertSelective(KeyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    List<KeyFile> selectByExample(KeyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    KeyFile selectByPrimaryKey(Integer keyfileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int updateByPrimaryKeySelective(KeyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KeyFile
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    int updateByPrimaryKey(KeyFile record);
}