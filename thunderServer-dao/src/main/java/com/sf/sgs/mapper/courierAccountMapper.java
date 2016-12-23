package com.sf.sgs.mapper;

import com.sf.sgs.domain.courierAccount;
import com.sf.sgs.domain.courierAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface courierAccountMapper {
    int countByExample(courierAccountExample example);

    int deleteByExample(courierAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(courierAccount record);

    int insertSelective(courierAccount record);

    List<courierAccount> selectByExample(courierAccountExample example);

    courierAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") courierAccount record, @Param("example") courierAccountExample example);

    int updateByExample(@Param("record") courierAccount record, @Param("example") courierAccountExample example);

    int updateByPrimaryKeySelective(courierAccount record);

    int updateByPrimaryKey(courierAccount record);
}