package com.sf.sgs.manager;

import java.util.List;
import com.sf.sgs.domain.CustomerAccount;
import com.sf.sgs.domain.CustomerAccountExample;

/**
 * CustomerAccountManager类
 *
 * @author 594829
*/
public interface CustomerAccountManager {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
    int countByExample(CustomerAccountExample example);

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByExample(CustomerAccountExample example);
	
	/**
	 * 按主键删除
	 * 
	 * @param id 
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByPrimaryKey(Long id);

	/**
	 * 新增
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insert(CustomerAccount record);
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insertSelective(CustomerAccount record);
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CustomerAccount> 记录列表
	 *
    */
    List<CustomerAccount> selectByExample(CustomerAccountExample example);

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
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExampleSelective(CustomerAccount record, CustomerAccountExample example);

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExample(CustomerAccount record,  CustomerAccountExample example);

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKeySelective(CustomerAccount record);


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKey(CustomerAccount record);
	
}