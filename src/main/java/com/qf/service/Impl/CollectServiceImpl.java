package com.qf.service.Impl;

import com.qf.dao.CollectMapper;
import com.qf.pojo.Collect;
import com.qf.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Service
public class CollectServiceImpl implements CollectService {

	@Resource
	private CollectMapper collectMapper;

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		return 0;
	}

	@Override
	public int insert(Collect record) {
		return 0;
	}

	@Override
	public int insertSelective(Collect record) {
		return collectMapper.insertSelective(record);
	}

	@Override
	public Collect selectByPrimaryKey(Integer cid) {
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Collect record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Collect record) {
		return 0;
	}

	@Override
	public List<Collect> findOnesCollect(Collect collect) {
		return collectMapper.findOnesCollect(collect);
	}
}
