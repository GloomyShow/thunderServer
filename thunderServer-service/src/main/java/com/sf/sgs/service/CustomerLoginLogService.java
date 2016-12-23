package com.sf.sgs.service;

import com.github.pagehelper.Page;
import com.sf.sgs.domain.CustomerLoginLog;
import com.sf.sgs.domain.CustomerLoginLogExample;

/**
 * CustomerLoginLogService类
 *
 * @author 594829
*/
public interface CustomerLoginLogService {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return Integer 记录总数
	 *
    */
	Integer countByExample(CustomerLoginLogExample example);

	/**
	 * 按主键删除
	 * 
	 * @param id 
	 * 
	 * @return Integer 成功条数  
	 *
    */
    Integer deleteByPrimaryKey(Long id);

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return Integer 成功条数  
	 *
    */
    Integer insert(CustomerLoginLog record);
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * 
	 * @return  Page<CustomerLoginLog> 记录列表 
	 *
    */
    Page<CustomerLoginLog> selectByExample(CustomerLoginLogExample example, Integer pageNum, Integer pageSize);

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CustomerLoginLog 记录 
	 *
    */
	CustomerLoginLog selectByPrimaryKey(Long id);
	
	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
	Integer updateByPrimaryKeySelective(CustomerLoginLog record);

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
    Integer updateByPrimaryKey(CustomerLoginLog record);
	
}