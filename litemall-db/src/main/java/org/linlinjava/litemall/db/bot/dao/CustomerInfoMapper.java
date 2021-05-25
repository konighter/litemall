package org.linlinjava.litemall.db.bot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.bot.domain.CustomerInfo;
import org.linlinjava.litemall.db.bot.domain.CustomerInfoExample;

public interface CustomerInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    long countByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int deleteByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int insert(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int insertSelective(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    CustomerInfo selectOneByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    CustomerInfo selectOneByExampleSelective(@Param("example") CustomerInfoExample example, @Param("selective") CustomerInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    List<CustomerInfo> selectByExampleSelective(@Param("example") CustomerInfoExample example, @Param("selective") CustomerInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    CustomerInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CustomerInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    CustomerInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustomerInfo record);
}