package com.mutiny.moscacal.dao;

import com.mutiny.moscacal.pojo.MessageSend;
import com.mutiny.moscacal.pojo.MessageSendExample;
import java.util.List;

public interface MessageSendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int deleteByPrimaryKey(Integer messageSendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int insert(MessageSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int insertSelective(MessageSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    List<MessageSend> selectByExample(MessageSendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    MessageSend selectByPrimaryKey(Integer messageSendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int updateByPrimaryKeySelective(MessageSend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int updateByPrimaryKey(MessageSend record);
}