package com.qf.service.Impl;

import com.qf.dao.FriendlistMapper;
import com.qf.pojo.Friendlist;
import com.qf.service.FriendlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Service
public class FriendlistServiceImpl implements FriendlistService {

	@Resource
	private FriendlistMapper friendlistMapper;


	@Override
	public int deleteByPrimaryKey(Integer fid) {
		return 0;
	}

	@Override
	public int insert(Friendlist record) {
		return 0;
	}

	@Override
	public int insertSelective(Friendlist record) {
		return friendlistMapper.insertSelective(record);
	}

	@Override
	public Friendlist selectByPrimaryKey(Integer fid) {
		return friendlistMapper.selectByPrimaryKey(fid);
	}

	@Override
	public int updateByPrimaryKeySelective(Friendlist record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Friendlist record) {
		return 0;
	}

	@Override
	public List<Friendlist> findById(int currentid) {
		return friendlistMapper.findById(currentid);
	}


}
