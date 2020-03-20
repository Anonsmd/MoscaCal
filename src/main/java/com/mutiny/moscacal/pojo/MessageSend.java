package com.mutiny.moscacal.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Message_Send
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-20 17:46:49
 */
public class MessageSend implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.Message_Send_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Integer messageSendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.user_id
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Integer messageInfoId;

    /**
     * Database Column Remarks:
     *   消息标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.message_title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String messageTitle;

    /**
     * Database Column Remarks:
     *   消息内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.message_text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String messageText;

    /**
     * Database Column Remarks:
     *   消息跳转url
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String messageUrl;

    /**
     * Database Column Remarks:
     *   已读 1 OR未读 0
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.status
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   消息类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String type;

    /**
     * Database Column Remarks:
     *   消息推送时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Date pushTime;

    /**
     * Database Column Remarks:
     *   删除状态位 1 delete 0 not delete
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Send.Is_del
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Byte isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.Message_Send_ID
     *
     * @return the value of Message_Send.Message_Send_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Integer getMessageSendId() {
        return messageSendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.Message_Send_ID
     *
     * @param messageSendId the value for Message_Send.Message_Send_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageSendId(Integer messageSendId) {
        this.messageSendId = messageSendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.user_id
     *
     * @return the value of Message_Send.user_id
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.user_id
     *
     * @param userId the value for Message_Send.user_id
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.Message_Info_ID
     *
     * @return the value of Message_Send.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Integer getMessageInfoId() {
        return messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.Message_Info_ID
     *
     * @param messageInfoId the value for Message_Send.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageInfoId(Integer messageInfoId) {
        this.messageInfoId = messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.message_title
     *
     * @return the value of Message_Send.message_title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.message_title
     *
     * @param messageTitle the value for Message_Send.message_title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.message_text
     *
     * @return the value of Message_Send.message_text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.message_text
     *
     * @param messageText the value for Message_Send.message_text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.message_url
     *
     * @return the value of Message_Send.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getMessageUrl() {
        return messageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.message_url
     *
     * @param messageUrl the value for Message_Send.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl == null ? null : messageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.status
     *
     * @return the value of Message_Send.status
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.status
     *
     * @param status the value for Message_Send.status
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.type
     *
     * @return the value of Message_Send.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.type
     *
     * @param type the value for Message_Send.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.push_time
     *
     * @return the value of Message_Send.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.push_time
     *
     * @param pushTime the value for Message_Send.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Send.Is_del
     *
     * @return the value of Message_Send.Is_del
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Send.Is_del
     *
     * @param isDel the value for Message_Send.Is_del
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Send
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageSendId=").append(messageSendId);
        sb.append(", userId=").append(userId);
        sb.append(", messageInfoId=").append(messageInfoId);
        sb.append(", messageTitle=").append(messageTitle);
        sb.append(", messageText=").append(messageText);
        sb.append(", messageUrl=").append(messageUrl);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", pushTime=").append(pushTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}