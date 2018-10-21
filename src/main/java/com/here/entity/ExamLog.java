package com.here.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExamLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.paper_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Integer paperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.user_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.question_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.score
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private BigDecimal score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.teacher_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.question_no
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Integer questionNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.create_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.update_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.status
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_log.answer
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    private String answer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.id
     *
     * @return the value of exam_log.id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.id
     *
     * @param id the value for exam_log.id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.paper_id
     *
     * @return the value of exam_log.paper_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.paper_id
     *
     * @param paperId the value for exam_log.paper_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.user_id
     *
     * @return the value of exam_log.user_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.user_id
     *
     * @param userId the value for exam_log.user_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.question_id
     *
     * @return the value of exam_log.question_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.question_id
     *
     * @param questionId the value for exam_log.question_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.score
     *
     * @return the value of exam_log.score
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.score
     *
     * @param score the value for exam_log.score
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.teacher_id
     *
     * @return the value of exam_log.teacher_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.teacher_id
     *
     * @param teacherId the value for exam_log.teacher_id
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.question_no
     *
     * @return the value of exam_log.question_no
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Integer getQuestionNo() {
        return questionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.question_no
     *
     * @param questionNo the value for exam_log.question_no
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setQuestionNo(Integer questionNo) {
        this.questionNo = questionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.create_time
     *
     * @return the value of exam_log.create_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.create_time
     *
     * @param createTime the value for exam_log.create_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.update_time
     *
     * @return the value of exam_log.update_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.update_time
     *
     * @param updateTime the value for exam_log.update_time
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.status
     *
     * @return the value of exam_log.status
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.status
     *
     * @param status the value for exam_log.status
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_log.answer
     *
     * @return the value of exam_log.answer
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_log.answer
     *
     * @param answer the value for exam_log.answer
     *
     * @mbg.generated Sat Oct 20 16:04:40 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}