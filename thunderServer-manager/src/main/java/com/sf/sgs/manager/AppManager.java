package com.sf.sgs.manager;

import java.util.List;
import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;

/**
 * appManager类
 *
 * @author 594829
*/
public interface AppManager {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
    int countByExample(AppExample example);

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByExample(AppExample example);
	
	/**
	 * 按主键删除
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByPrimaryKey(Long appId);

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insert(App record);
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insertSelective(App record);
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<App> 记录列表
	 *
    */
    List<App> selectByExample(AppExample example);

	/**
	 * 按主键查询
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return App 记录 
	 *
    */
    App selectByPrimaryKey(Long appId);

	/**
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExampleSelective(App record, AppExample example);

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExample(App record,  AppExample example);

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKeySelective(App record);


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKey(App record);
	
}