package com.mutiny.moscacal.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table File_Module
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-17 17:46:15
 */
public class FileModule implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Module.File_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Module.File_URL
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Module.Module_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private Integer moduleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Module.Encode_Algorithm
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private String encodeAlgorithm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Module.KeyFileId
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private Integer keyfileid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table File_Module
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Module.File_ID
     *
     * @return the value of File_Module.File_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Module.File_ID
     *
     * @param fileId the value for File_Module.File_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Module.File_URL
     *
     * @return the value of File_Module.File_URL
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Module.File_URL
     *
     * @param fileUrl the value for File_Module.File_URL
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Module.Module_ID
     *
     * @return the value of File_Module.Module_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Module.Module_ID
     *
     * @param moduleId the value for File_Module.Module_ID
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Module.Encode_Algorithm
     *
     * @return the value of File_Module.Encode_Algorithm
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public String getEncodeAlgorithm() {
        return encodeAlgorithm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Module.Encode_Algorithm
     *
     * @param encodeAlgorithm the value for File_Module.Encode_Algorithm
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public void setEncodeAlgorithm(String encodeAlgorithm) {
        this.encodeAlgorithm = encodeAlgorithm == null ? null : encodeAlgorithm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Module.KeyFileId
     *
     * @return the value of File_Module.KeyFileId
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public Integer getKeyfileid() {
        return keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Module.KeyFileId
     *
     * @param keyfileid the value for File_Module.KeyFileId
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    public void setKeyfileid(Integer keyfileid) {
        this.keyfileid = keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table File_Module
     *
     * @mbg.generated 2020-03-17 17:46:15
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", encodeAlgorithm=").append(encodeAlgorithm);
        sb.append(", keyfileid=").append(keyfileid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}