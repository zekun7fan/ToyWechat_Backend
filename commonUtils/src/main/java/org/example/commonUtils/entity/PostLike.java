package org.example.commonUtils.entity;

import java.time.LocalDateTime;

public class PostLike {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_like.id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_like.user_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_like.post_content_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    private String postContentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_like.create_time
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    private LocalDateTime createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_like.id
     *
     * @return the value of post_like.id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_like.id
     *
     * @param id the value for post_like.id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_like.user_id
     *
     * @return the value of post_like.user_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_like.user_id
     *
     * @param userId the value for post_like.user_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_like.post_content_id
     *
     * @return the value of post_like.post_content_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public String getPostContentId() {
        return postContentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_like.post_content_id
     *
     * @param postContentId the value for post_like.post_content_id
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public void setPostContentId(String postContentId) {
        this.postContentId = postContentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_like.create_time
     *
     * @return the value of post_like.create_time
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_like.create_time
     *
     * @param createTime the value for post_like.create_time
     *
     * @mbg.generated Sun May 22 12:58:12 EDT 2022
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}