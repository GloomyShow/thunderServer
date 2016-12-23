package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;
import com.sf.sgs.mapper.AppMapper;
import com.sf.sgs.manager.AppManager;

/**
 * appManager实现类
 *
 * @author 594829
*/
@Component
public class AppManagerImpl implements AppManager {

	@Autowired
	private AppMapper appMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(AppExample example){
		return appMapper.countByExample(example);
	}

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int deleteByExample(AppExample example){
		return appMapper.deleteByExample(example);
	}
	
	/**
	 * 按主键删除
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int deleteByPrimaryKey(Long appId){
		return appMapper.deleteByPrimaryKey(appId);
	}

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int insert(App record){
	    return appMapper.insert(record);
	}
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int insertSelective(App record){
		return appMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<App> 记录列表
	 *
    */
	@Override
    public List<App> selectByExample(AppExample example){
		return appMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return App 记录 
	 *
    */
	@Override
    public App selectByPrimaryKey(Long appId){
		return appMapper.selectByPrimaryKey(appId);
	}

	/**
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
	@Override
    public int updateByExampleSelective(App record, AppExample example){
		return appMapper.updateByExampleSelective(record, example);
	}

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
	@Override
    public int updateByExample(App record,  AppExample example){
		return appMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(App record){
		return appMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(App record){
		return appMapper.updateByPrimaryKey(record);
	}
	
}