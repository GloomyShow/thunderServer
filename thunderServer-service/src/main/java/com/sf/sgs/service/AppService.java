package com.sf.sgs.service;

import com.github.pagehelper.Page;
import com.sf.sgs.domain.App;
import com.sf.sgs.domain.AppExample;

/**
 * appService类
 *
 * @author 594829
*/
public interface AppService {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return Integer 记录总数
	 *
    */
	Integer countByExample(AppExample example);

	/**
	 * 按主键删除
	 * 
	 * @param appId 唯一的ID（没有啥意义，主键，自增长而已）
	 * 
	 * @return Integer 成功条数  
	 *
    */
    Integer deleteByPrimaryKey(Long appId);

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return Integer 成功条数  
	 *
    */
    Integer insert(App record);
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * 
	 * @return  Page<App> 记录列表 
	 *
    */
    Page<App> selectByExample(AppExample example, Integer pageNum, Integer pageSize);

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
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
	Integer updateByPrimaryKeySelective(App record);

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
    Integer updateByPrimaryKey(App record);
	
}