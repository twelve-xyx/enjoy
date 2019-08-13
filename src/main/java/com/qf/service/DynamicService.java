package com.qf.service;

import com.qf.pojo.Dynamic;

import java.util.List;
import java.util.Map;

public interface DynamicService {

    List<Dynamic> findall();

    List<Dynamic> findbyid(Integer userid);

    List<Dynamic> friend(Integer userid);

    int insert(Dynamic record);
    void dynamiduserid(Integer userid,Integer dyid);

    Map<String,Object> dianZan(Integer status, Integer dynamicId);

    List<Dynamic> findallDynamic(int userid);
}
