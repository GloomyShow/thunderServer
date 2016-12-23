package com.sf.sgs.mapper;

import com.sf.sgs.domain.thunderOrder;
import com.sf.sgs.domain.thunderOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author 594829
 */
public interface thunderOrderMapper {
    int countByExample(thunderOrderExample example);

    int deleteByExample(thunderOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(thunderOrder record);

    int insertSelective(thunderOrder record);

    List<thunderOrder> selectByExample(thunderOrderExample example);

    thunderOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") thunderOrder record, @Param("example") thunderOrderExample example);

    int updateByExample(@Param("record") thunderOrder record, @Param("example") thunderOrderExample example);

    int updateByPrimaryKeySelective(thunderOrder record);

    int updateByPrimaryKey(thunderOrder record);
}