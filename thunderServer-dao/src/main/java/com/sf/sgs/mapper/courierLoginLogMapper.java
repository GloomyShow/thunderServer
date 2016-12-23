package com.sf.sgs.mapper;

import com.sf.sgs.domain.courierLoginLog;
import com.sf.sgs.domain.courierLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface courierLoginLogMapper {
    int countByExample(courierLoginLogExample example);

    int deleteByExample(courierLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(courierLoginLog record);

    int insertSelective(courierLoginLog record);

    List<courierLoginLog> selectByExample(courierLoginLogExample example);

    courierLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") courierLoginLog record, @Param("example") courierLoginLogExample example);

    int updateByExample(@Param("record") courierLoginLog record, @Param("example") courierLoginLogExample example);

    int updateByPrimaryKeySelective(courierLoginLog record);

    int updateByPrimaryKey(courierLoginLog record);
}