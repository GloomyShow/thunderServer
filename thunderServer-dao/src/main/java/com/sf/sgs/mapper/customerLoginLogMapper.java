package com.sf.sgs.mapper;

import com.sf.sgs.domain.customerLoginLog;
import com.sf.sgs.domain.customerLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface customerLoginLogMapper {
    int countByExample(customerLoginLogExample example);

    int deleteByExample(customerLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(customerLoginLog record);

    int insertSelective(customerLoginLog record);

    List<customerLoginLog> selectByExample(customerLoginLogExample example);

    customerLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") customerLoginLog record, @Param("example") customerLoginLogExample example);

    int updateByExample(@Param("record") customerLoginLog record, @Param("example") customerLoginLogExample example);

    int updateByPrimaryKeySelective(customerLoginLog record);

    int updateByPrimaryKey(customerLoginLog record);
}