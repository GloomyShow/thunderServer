package com.sf.sgs.manager;

import java.util.List;
import com.sf.sgs.domain.CourierAccount;
import com.sf.sgs.domain.CourierAccountExample;

/**
 * CourierAccountManager类
 *
 * @author 594829
*/
public interface CourierAccountManager {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
    int countByExample(CourierAccountExample example);

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByExample(CourierAccountExample example);
	
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
    int insert(CourierAccount record);
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insertSelective(CourierAccount record);
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CourierAccount> 记录列表
	 *
    */
    List<CourierAccount> selectByExample(CourierAccountExample example);

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
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExampleSelective(CourierAccount record, CourierAccountExample example);

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExample(CourierAccount record,  CourierAccountExample example);

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKeySelective(CourierAccount record);


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKey(CourierAccount record);


	/**
	 * 查询当前用户附近的收派员
	 * @param courierType 收件员类型
	 * @param company 公司名称
	 * @return
	 */
	List<CourierAccount> selectByType(int courierType,String company);


}