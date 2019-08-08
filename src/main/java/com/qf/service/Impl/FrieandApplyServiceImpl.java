package com.qf.service.Impl;

import com.qf.dao.FrieandApplyMapper;
import com.qf.pojo.FrieandApply;
import com.qf.service.FrieandApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Service
public class FrieandApplyServiceImpl implements FrieandApplyService {

	@Resource
	private FrieandApplyMapper frieandApplyMapper;


	@Override
	public int deleteByPrimaryKey(Integer fid) {
		return 0;
	}

	@Override
	public int insert(FrieandApply record) {
		return 0;
	}

	@Override
	public int insertSelective(FrieandApply record) {
		return frieandApplyMapper.insertSelective(record);
	}

	@Override
	public FrieandApply selectByPrimaryKey(Integer fid) {
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(FrieandApply record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(FrieandApply record) {
		return 0;
	}

	public List<FrieandApply> findById(int currentid){
		return frieandApplyMapper.findById(currentid);
	}

	@Override
	public int deleteByUidAndCurrentuid(int uid, int currentid) {
		return frieandApplyMapper.deleteByUidAndCurrentuid(uid, currentid);
	}
}
