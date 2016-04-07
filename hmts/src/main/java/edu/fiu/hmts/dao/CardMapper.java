package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.Card;
import edu.fiu.hmts.domain.CardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int countByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int deleteByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int deleteByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int insert(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int insertSelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    List<Card> selectByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    Card selectByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int updateByPrimaryKeySelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    int updateByPrimaryKey(Card record);
}