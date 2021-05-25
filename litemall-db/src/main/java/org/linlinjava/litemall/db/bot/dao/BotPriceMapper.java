package org.linlinjava.litemall.db.bot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.bot.domain.BotPrice;
import org.linlinjava.litemall.db.bot.domain.BotPriceExample;

public interface BotPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    long countByExample(BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int deleteByExample(BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int insert(BotPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int insertSelective(BotPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    BotPrice selectOneByExample(BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    BotPrice selectOneByExampleSelective(@Param("example") BotPriceExample example, @Param("selective") BotPrice.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    List<BotPrice> selectByExampleSelective(@Param("example") BotPriceExample example, @Param("selective") BotPrice.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    List<BotPrice> selectByExample(BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    BotPrice selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BotPrice.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    BotPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BotPrice record, @Param("example") BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BotPrice record, @Param("example") BotPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BotPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bot_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BotPrice record);
}