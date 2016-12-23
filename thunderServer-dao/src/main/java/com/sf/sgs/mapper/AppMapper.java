package com.sf.sgs.mapper;

import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * appMapper类
 * 
 * @author 594829
 */
public interface AppMapper {
    int countByExample(AppExample example);

    int deleteByExample(AppExample example);

    int deleteByPrimaryKey(Long appId);

    int insert(App record);

    int insertSelective(App record);

    List<App> selectByExample(AppExample example);

    App selectByPrimaryKey(Long appId);

    int updateByExampleSelective(@Param("record") App record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
}