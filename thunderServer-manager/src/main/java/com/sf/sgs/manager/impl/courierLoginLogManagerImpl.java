package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.courierLoginLog;
import com.sf.sgs.domain.courierLoginLogExample;
import com.sf.sgs.mapper.courierLoginLogMapper;
import com.sf.sgs.manager.courierLoginLogManager;

/**
 * courierLoginLogManager实现类
 *
 * @author 594829
*/
@Component
public class courierLoginLogManagerImpl implements courierLoginLogManager {

	@Autowired
	private courierLoginLogMapper courierLoginLogMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(courierLoginLogExample example){
		return courierLoginLogMapper.countByExample(example);
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
    public int deleteByExample(courierLoginLogExample example){
		return courierLoginLogMapper.deleteByExample(example);
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
		return courierLoginLogMapper.deleteByPrimaryKey(id);
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
    public int insert(courierLoginLog record){
	    return courierLoginLogMapper.insert(record);
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
    public int insertSelective(courierLoginLog record){
		return courierLoginLogMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<courierLoginLog> 记录列表
	 *
    */
	@Override
    public List<courierLoginLog> selectByExample(courierLoginLogExample example){
		return courierLoginLogMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return courierLoginLog 记录 
	 *
    */
	@Override
    public courierLoginLog selectByPrimaryKey(Long id){
		return courierLoginLogMapper.selectByPrimaryKey(id);
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
    public int updateByExampleSelective(courierLoginLog record, courierLoginLogExample example){
		return courierLoginLogMapper.updateByExampleSelective(record, example);
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
    public int updateByExample(courierLoginLog record,  courierLoginLogExample example){
		return courierLoginLogMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(courierLoginLog record){
		return courierLoginLogMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(courierLoginLog record){
		return courierLoginLogMapper.updateByPrimaryKey(record);
	}
	
}