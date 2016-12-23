package com.sf.sgs.mapper;

import com.sf.sgs.domain.CustomerAccount;
import com.sf.sgs.domain.CustomerAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface CustomerAccountMapper {
    int countByExample(CustomerAccountExample example);

    int deleteByExample(CustomerAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAccount record);

    int insertSelective(CustomerAccount record);

    List<CustomerAccount> selectByExample(CustomerAccountExample example);

    CustomerAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerAccount record, @Param("example") CustomerAccountExample example);

    int updateByExample(@Param("record") CustomerAccount record, @Param("example") CustomerAccountExample example);

    int updateByPrimaryKeySelective(CustomerAccount record);

    int updateByPrimaryKey(CustomerAccount record);
}