package com.here.dao;

import com.here.entity.ExamLog;
import com.here.entity.ExamLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    long countByExample(ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int deleteByExample(ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int insert(ExamLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int insertSelective(ExamLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    List<ExamLog> selectByExampleWithBLOBs(ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    List<ExamLog> selectByExample(ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    ExamLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") ExamLog record, @Param("example") ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ExamLog record, @Param("example") ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByExample(@Param("record") ExamLog record, @Param("example") ExamLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByPrimaryKeySelective(ExamLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ExamLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_log
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByPrimaryKey(ExamLog record);
}