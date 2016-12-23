package com.sf.sgs.manager;

import java.util.List;
import com.sf.sgs.domain.courierLoginLog;
import com.sf.sgs.domain.courierLoginLogExample;

/**
 * courierLoginLogManager类
 *
 * @author 594829
*/
public interface courierLoginLogManager {
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
    int countByExample(courierLoginLogExample example);

	/**
	 * 按条件删除
	 * 
	 * @param example 条件
	 * 
	 * @return int 成功条数  
	 *
    */
    int deleteByExample(courierLoginLogExample example);
	
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
    int insert(courierLoginLog record);
	
	/**
	 * 新增,null字段不插入
	 * 
	 * @param record 记录
	 * 
	 * @return int 成功条数  
	 *
    */
    int insertSelective(courierLoginLog record);
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<courierLoginLog> 记录列表
	 *
    */
    List<courierLoginLog> selectByExample(courierLoginLogExample example);

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return courierLoginLog 记录 
	 *
    */
    courierLoginLog selectByPrimaryKey(Long id);

	/**
	 * 按条件更新,null字段不更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExampleSelective(courierLoginLog record, courierLoginLogExample example);

	
	/**
	 * 按条件更新
	 * 
	 * @param record 记录
	 * @param example 条件
	 * @return int 成功条数  
	 *
    */
    int updateByExample(courierLoginLog record,  courierLoginLogExample example);

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKeySelective(courierLoginLog record);


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    int updateByPrimaryKey(courierLoginLog record);
	
}