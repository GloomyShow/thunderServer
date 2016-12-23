package com.sf.sgs.mapper;

import com.sf.sgs.domain.CourierLoginLog;
import com.sf.sgs.domain.CourierLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface CourierLoginLogMapper {
    int countByExample(CourierLoginLogExample example);

    int deleteByExample(CourierLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourierLoginLog record);

    int insertSelective(CourierLoginLog record);

    List<CourierLoginLog> selectByExample(CourierLoginLogExample example);

    CourierLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourierLoginLog record, @Param("example") CourierLoginLogExample example);

    int updateByExample(@Param("record") CourierLoginLog record, @Param("example") CourierLoginLogExample example);

    int updateByPrimaryKeySelective(CourierLoginLog record);

    int updateByPrimaryKey(CourierLoginLog record);

    CourierLoginLog selectByCorierAccountId(Long coId);
}