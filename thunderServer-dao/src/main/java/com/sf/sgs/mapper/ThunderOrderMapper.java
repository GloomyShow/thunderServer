package com.sf.sgs.mapper;

import com.sf.sgs.domain.ThunderOrder;
import com.sf.sgs.domain.ThunderOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface ThunderOrderMapper {
    int countByExample(ThunderOrderExample example);

    int deleteByExample(ThunderOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ThunderOrder record);

    int insertSelective(ThunderOrder record);

    List<ThunderOrder> selectByExample(ThunderOrderExample example);

    ThunderOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ThunderOrder record, @Param("example") ThunderOrderExample example);

    int updateByExample(@Param("record") ThunderOrder record, @Param("example") ThunderOrderExample example);

    int updateByPrimaryKeySelective(ThunderOrder record);

    int updateByPrimaryKey(ThunderOrder record);
}