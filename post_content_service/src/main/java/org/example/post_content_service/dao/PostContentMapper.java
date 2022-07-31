package org.example.post_content_service.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.commonUtils.entity.PostContent;
import org.example.commonUtils.entity.PostContentExample;

public interface PostContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    long countByExample(PostContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int deleteByExample(PostContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int insert(PostContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int insertSelective(PostContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    List<PostContent> selectByExample(PostContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    PostContent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int updateByExampleSelective(@Param("record") PostContent record, @Param("example") PostContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int updateByExample(@Param("record") PostContent record, @Param("example") PostContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int updateByPrimaryKeySelective(PostContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_content
     *
     * @mbg.generated Sun May 22 14:10:44 EDT 2022
     */
    int updateByPrimaryKey(PostContent record);


    List<PostContent> get10PostContentListAfterID(@Param("uid") String uid, @Param("id") Integer id);

    List<PostContent> get1PostContentListAfterID(@Param("uid") String uid, @Param("id") Integer id);


    List<PostContent> get10PostContentListBeforeID(@Param("uid") String uid, @Param("id") Integer id);

    List<PostContent> get1PostContentListBeforeID(@Param("uid") String uid, @Param("id") Integer id);
}