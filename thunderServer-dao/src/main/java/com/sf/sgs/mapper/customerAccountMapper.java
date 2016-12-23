package com.sf.sgs.mapper;

import com.sf.sgs.domain.customerAccount;
import com.sf.sgs.domain.customerAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface customerAccountMapper {
    int countByExample(customerAccountExample example);

    int deleteByExample(customerAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(customerAccount record);

    int insertSelective(customerAccount record);

    List<customerAccount> selectByExample(customerAccountExample example);

    customerAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") customerAccount record, @Param("example") customerAccountExample example);

    int updateByExample(@Param("record") customerAccount record, @Param("example") customerAccountExample example);

    int updateByPrimaryKeySelective(customerAccount record);

    int updateByPrimaryKey(customerAccount record);
}