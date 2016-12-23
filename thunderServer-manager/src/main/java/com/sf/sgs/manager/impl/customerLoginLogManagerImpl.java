package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.customerLoginLog;
import com.sf.sgs.domain.customerLoginLogExample;
import com.sf.sgs.mapper.customerLoginLogMapper;
import com.sf.sgs.manager.customerLoginLogManager;

/**
 * customerLoginLogManager实现类
 *
 * @author 594829
*/
@Component
public class customerLoginLogManagerImpl implements customerLoginLogManager {

	@Autowired
	private customerLoginLogMapper customerLoginLogMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(customerLoginLogExample example){
		return customerLoginLogMapper.countByExample(example);
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
    public int deleteByExample(customerLoginLogExample example){
		return customerLoginLogMapper.deleteByExample(example);
	}
	
	/**
	 * 按主键删除
	 * 
	 * @param id 
	 * 
	 * @return int 成功条数  
	 *
    */
	@Override
    public int deleteByPrimaryKey(Long id){
		return customerLoginLogMapper.deleteByPrimaryKey(id);
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
    public int insert(customerLoginLog record){
	    return customerLoginLogMapper.insert(record);
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
    public int insertSelective(customerLoginLog record){
		return customerLoginLogMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<customerLoginLog> 记录列表
	 *
    */
	@Override
    public List<customerLoginLog> selectByExample(customerLoginLogExample example){
		return customerLoginLogMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return customerLoginLog 记录 
	 *
    */
	@Override
    public customerLoginLog selectByPrimaryKey(Long id){
		return customerLoginLogMapper.selectByPrimaryKey(id);
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
    public int updateByExampleSelective(customerLoginLog record, customerLoginLogExample example){
		return customerLoginLogMapper.updateByExampleSelective(record, example);
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
    public int updateByExample(customerLoginLog record,  customerLoginLogExample example){
		return customerLoginLogMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(customerLoginLog record){
		return customerLoginLogMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(customerLoginLog record){
		return customerLoginLogMapper.updateByPrimaryKey(record);
	}
	
}