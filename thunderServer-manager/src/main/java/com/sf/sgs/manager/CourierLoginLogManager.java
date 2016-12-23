package com.sf.sgs.manager;

import java.util.List;
import com.sf.sgs.domain.CourierLoginLog;
import com.sf.sgs.domain.CourierLoginLogExample;

/**
 * CourierLoginLogManager类
 *
 * @author 594829
*/
public interface CourierLoginLogManager {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
    int countByExample(CourierLoginLogExample example);

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByExample(CourierLoginLogExample example);
	
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
    int insert(CourierLoginLog record);
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insertSelective(CourierLoginLog record);
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CourierLoginLog> 记录列表
	 *
    */
    List<CourierLoginLog> selectByExample(CourierLoginLogExample example);

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CourierLoginLog 记录 
	 *
    */
    CourierLoginLog selectByPrimaryKey(Long id);

	/**
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExampleSelective(CourierLoginLog record, CourierLoginLogExample example);

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExample(CourierLoginLog record,  CourierLoginLogExample example);

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKeySelective(CourierLoginLog record);


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKey(CourierLoginLog record);
	
}