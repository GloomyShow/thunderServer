package com.sf.sgs.manager.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.sgs.domain.thunderOrder;
import com.sf.sgs.domain.thunderOrderExample;
import com.sf.sgs.mapper.thunderOrderMapper;
import com.sf.sgs.manager.thunderOrderManager;

/**
 * thunderOrderManager实现类
 *
 * @author 594829
*/
@Component
public class thunderOrderManagerImpl implements thunderOrderManager {

	@Autowired
	private thunderOrderMapper thunderOrderMapper;
	
	/**
	 * 按条件计数
	 * 
	 * @param example 条件
	 * 
	 * @return int 记录总数
	 *
    */
	@Override
    public int countByExample(thunderOrderExample example){
		return thunderOrderMapper.countByExample(example);
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
    public int deleteByExample(thunderOrderExample example){
		return thunderOrderMapper.deleteByExample(example);
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
		return thunderOrderMapper.deleteByPrimaryKey(id);
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
    public int insert(thunderOrder record){
	    return thunderOrderMapper.insert(record);
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
    public int insertSelective(thunderOrder record){
		return thunderOrderMapper.insertSelective(record);
	}
	
	
	/**
	 * 按条件查询
	 * 
	 * @param example 条件
	 * 
	 * @return List<thunderOrder> 记录列表
	 *
    */
	@Override
    public List<thunderOrder> selectByExample(thunderOrderExample example){
		return thunderOrderMapper.selectByExample(example);
	}

	/**
	 * 按主键查询
	 * 
	 * @param id 
	 * 
	 * @return thunderOrder 记录 
	 *
    */
	@Override
    public thunderOrder selectByPrimaryKey(Long id){
		return thunderOrderMapper.selectByPrimaryKey(id);
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
    public int updateByExampleSelective(thunderOrder record, thunderOrderExample example){
		return thunderOrderMapper.updateByExampleSelective(record, example);
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
    public int updateByExample(thunderOrder record,  thunderOrderExample example){
		return thunderOrderMapper.updateByExample(record, example);
	}

	/**
	 * 按主键更新,null的字段不更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
    public int updateByPrimaryKeySelective(thunderOrder record){
		return thunderOrderMapper.updateByPrimaryKeySelective(record);
	}


	/**
	 * 按主键更新
	 * 
	 * @param record 记录
	 * @return int 成功条数 
	 *
    */
	@Override
    public int updateByPrimaryKey(thunderOrder record){
		return thunderOrderMapper.updateByPrimaryKey(record);
	}
	
}