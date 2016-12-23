package com.sf.sgs.service;

import com.github.pagehelper.Page;
import com.sf.sgs.domain.CustomerAccount;
import com.sf.sgs.domain.CustomerAccountExample;

/**
 * CustomerAccountService类
 *
 * @author 594829
*/
public interface CustomerAccountService {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return Integer 记录总数
	 *
    */
	Integer countByExample(CustomerAccountExample example);

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
    Integer insert(CustomerAccount record);
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * 
	 * @return  Page<CustomerAccount> 记录列表 
	 *
    */
    Page<CustomerAccount> selectByExample(CustomerAccountExample example, Integer pageNum, Integer pageSize);

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CustomerAccount 记录 
	 *
    */
	CustomerAccount selectByPrimaryKey(Long id);
	
	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
	Integer updateByPrimaryKeySelective(CustomerAccount record);

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
    Integer updateByPrimaryKey(CustomerAccount record);
	
}