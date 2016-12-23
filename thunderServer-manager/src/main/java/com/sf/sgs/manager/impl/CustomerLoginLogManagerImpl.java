package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.CustomerLoginLog;
import com.sf.sgs.domain.CustomerLoginLogExample;
import com.sf.sgs.mapper.CustomerLoginLogMapper;
import com.sf.sgs.manager.CustomerLoginLogManager;

/**
 * CustomerLoginLogManager实现类
 *
 * @author 594829
*/
@Component
public class CustomerLoginLogManagerImpl implements CustomerLoginLogManager {

	@Autowired
	private CustomerLoginLogMapper customerLoginLogMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(CustomerLoginLogExample example){
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
    public int deleteByExample(CustomerLoginLogExample example){
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
    public int insert(CustomerLoginLog record){
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
    public int insertSelective(CustomerLoginLog record){
		return customerLoginLogMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<CustomerLoginLog> 记录列表
	 *
    */
	@Override
    public List<CustomerLoginLog> selectByExample(CustomerLoginLogExample example){
		return customerLoginLogMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return CustomerLoginLog 记录 
	 *
    */
	@Override
    public CustomerLoginLog selectByPrimaryKey(Long id){
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
    public int updateByExampleSelective(CustomerLoginLog record, CustomerLoginLogExample example){
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
    public int updateByExample(CustomerLoginLog record,  CustomerLoginLogExample example){
		return customerLoginLogMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(CustomerLoginLog record){
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
    public int updateByPrimaryKey(CustomerLoginLog record){
		return customerLoginLogMapper.updateByPrimaryKey(record);
	}
	
}