package com.qf.service.Impl;

import com.qf.dao.DynamicMapper;
import com.qf.pojo.Dynamic;
import com.qf.pojo.DynamicExample;
import com.qf.service.DynamicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Resource
    private DynamicMapper dynamicMapper;

    public List<Dynamic> findall() {
        DynamicExample dynamicExample = new DynamicExample();
        List<Dynamic> dynamics = dynamicMapper.selectByExample(dynamicExample);
        return dynamics;
    }
}
