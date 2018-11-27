package com.here.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ExamPaper {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.id
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.name
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.type
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.start_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.end_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.total_score
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private BigDecimal totalScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.passing
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private BigDecimal passing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.status
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.create_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.update_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper.max_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    private Integer maxTime;

    private List<Integer> questionIdList;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.id
     *
     * @return the value of exam_paper.id
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.id
     *
     * @param id the value for exam_paper.id
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.name
     *
     * @return the value of exam_paper.name
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.name
     *
     * @param name the value for exam_paper.name
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.type
     *
     * @return the value of exam_paper.type
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.type
     *
     * @param type the value for exam_paper.type
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.start_time
     *
     * @return the value of exam_paper.start_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.start_time
     *
     * @param startTime the value for exam_paper.start_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.end_time
     *
     * @return the value of exam_paper.end_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.end_time
     *
     * @param endTime the value for exam_paper.end_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.total_score
     *
     * @return the value of exam_paper.total_score
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public BigDecimal getTotalScore() {
        return totalScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.total_score
     *
     * @param totalScore the value for exam_paper.total_score
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.passing
     *
     * @return the value of exam_paper.passing
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public BigDecimal getPassing() {
        return passing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.passing
     *
     * @param passing the value for exam_paper.passing
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setPassing(BigDecimal passing) {
        this.passing = passing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.status
     *
     * @return the value of exam_paper.status
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.status
     *
     * @param status the value for exam_paper.status
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.create_time
     *
     * @return the value of exam_paper.create_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.create_time
     *
     * @param createTime the value for exam_paper.create_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.update_time
     *
     * @return the value of exam_paper.update_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.update_time
     *
     * @param updateTime the value for exam_paper.update_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper.max_time
     *
     * @return the value of exam_paper.max_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public Integer getMaxTime() {
        return maxTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper.max_time
     *
     * @param maxTime the value for exam_paper.max_time
     *
     * @mbg.generated Sat Oct 20 17:11:30 CST 2018
     */
    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public List<Integer> getQuestionIdList() {
        return questionIdList;
    }

    public void setQuestionIdList(List<Integer> questionIdList) {
        this.questionIdList = questionIdList;
    }
}