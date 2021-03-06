package com.here.dao;

import com.here.entity.ExamRoom;
import com.here.entity.ExamRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    long countByExample(ExamRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int deleteByExample(ExamRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int insert(ExamRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int insertSelective(ExamRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    List<ExamRoom> selectByExample(ExamRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    ExamRoom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") ExamRoom record, @Param("example") ExamRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByExample(@Param("record") ExamRoom record, @Param("example") ExamRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByPrimaryKeySelective(ExamRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_room
     *
     * @mbg.generated Mon Oct 15 11:20:36 CST 2018
     */
    int updateByPrimaryKey(ExamRoom record);
}