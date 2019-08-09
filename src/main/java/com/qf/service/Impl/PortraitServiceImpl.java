package com.qf.service.Impl;

import com.qf.dao.PortraitMapper;
import com.qf.pojo.Portrait;
import com.qf.service.PortraitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PortraitServiceImpl implements PortraitService {

    @Resource
    private PortraitMapper portraitMapper;

    /**
     * 获取好友id
     * @param userid
     * @return
     */
    public List<Portrait> getfriend(Integer userid) {
        return portraitMapper.getfriend(userid);
    }
}
