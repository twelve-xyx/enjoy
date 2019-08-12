package com.qf.service;

import com.qf.pojo.Dynamic;

import java.util.List;
import java.util.Map;

public interface DynamicService {

    public Map<String,Object> dianZan(Integer status, Integer dynamicId);

    public List<Dynamic> findall();

    int insert(Dynamic record);

    public List<Dynamic> findbyid(Integer userid);

    public List<Dynamic> friend(Integer userid);

    List<Dynamic> findallDynamic(int userid);
}
