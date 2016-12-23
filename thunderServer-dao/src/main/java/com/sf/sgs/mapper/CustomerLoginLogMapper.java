package com.sf.sgs.mapper;

import com.sf.sgs.domain.CustomerLoginLog;
import com.sf.sgs.domain.CustomerLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface CustomerLoginLogMapper {
    int countByExample(CustomerLoginLogExample example);

    int deleteByExample(CustomerLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerLoginLog record);

    int insertSelective(CustomerLoginLog record);

    List<CustomerLoginLog> selectByExample(CustomerLoginLogExample example);

    CustomerLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerLoginLog record, @Param("example") CustomerLoginLogExample example);

    int updateByExample(@Param("record") CustomerLoginLog record, @Param("example") CustomerLoginLogExample example);

    int updateByPrimaryKeySelective(CustomerLoginLog record);

    int updateByPrimaryKey(CustomerLoginLog record);
}