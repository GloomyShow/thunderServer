package com.sf.sgs.service;

import com.github.pagehelper.Page;
import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.domain.CourierAccountExample;

import java.util.List;

/**
 * CourierAccountService类
 *
 * @author 594829
*/
public interface CourierAccountService {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return Integer 记录总数
	 *
    */
	Integer countByExample(CourierAccountExample example);

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
    Integer insert(CourierAccount record);
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * 
	 * @return  Page<CourierAccount> 记录列表 
	 *
    */
    Page<CourierAccount> selectByExample(CourierAccountExample example, Integer pageNum, Integer pageSize);

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CourierAccount 记录 
	 *
    */
	CourierAccount selectByPrimaryKey(Long id);
	
	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
	Integer updateByPrimaryKeySelective(CourierAccount record);

	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return Integer 成功条数  
	 *
    */
    Integer updateByPrimaryKey(CourierAccount record);


	/**
	 * 查询当前用户附近的收派员
	 * @param courierType 收件员类型
	 * @param company 公司名称
	 * @return
	 */
	List<CourierAccount> selectByType(int courierType,String company);
	
}