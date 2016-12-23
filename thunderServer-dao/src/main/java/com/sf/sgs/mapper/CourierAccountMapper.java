package com.sf.sgs.mapper;

import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.domain.CourierAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface CourierAccountMapper {
    int countByExample(CourierAccountExample example);

    int deleteByExample(CourierAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourierAccount record);

    int insertSelective(CourierAccount record);

    List<CourierAccount> selectByExample(CourierAccountExample example);

    CourierAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourierAccount record, @Param("example") CourierAccountExample example);

    int updateByExample(@Param("record") CourierAccount record, @Param("example") CourierAccountExample example);

    int updateByPrimaryKeySelective(CourierAccount record);

    int updateByPrimaryKey(CourierAccount record);

    List<CourierAccount> selectByType(@Param("courierType")int courierType,@Param("company")String company);
}