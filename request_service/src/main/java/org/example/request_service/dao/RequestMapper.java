package org.example.request_service.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.commonUtils.entity.Request;
import org.example.commonUtils.entity.RequestExample;

public interface RequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    long countByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int deleteByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int insert(Request record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int insertSelective(Request record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    List<Request> selectByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    Request selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int updateByExampleSelective(@Param("record") Request record, @Param("example") RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int updateByExample(@Param("record") Request record, @Param("example") RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int updateByPrimaryKeySelective(Request record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table request
     *
     * @mbg.generated Wed Jul 27 19:35:52 EDT 2022
     */
    int updateByPrimaryKey(Request record);
}