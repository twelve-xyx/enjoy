package com.qf.service.Impl;

import com.qf.dao.DynamicMapper;
import com.qf.pojo.Dynamic;
import com.qf.pojo.DynamicExample;
import com.qf.service.DynamicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Resource
    private DynamicMapper dynamicMapper;

    /**
     * 查看所有动态
     * @return
     */
    public List<Dynamic> findall() {
        return dynamicMapper.findall();
    }

    /**
     *查看个人动态
     * @param userid
     * @return
     */
    public List<Dynamic> findbyid(Integer userid) {
        return dynamicMapper.findbyid(userid);
    }

    /**
     * 查看好友动态
     * @param userid
     * @return
     */
    public List<Dynamic> friend(Integer userid) {
        return dynamicMapper.friend(userid);
    }

    /**
     * 发布动态
     * @param record
     * @return
     */
    public int insert(Dynamic record) {
        return dynamicMapper.insert(record);
    }
    public void dynamiduserid(Integer dyid, Integer userid) {
        dynamicMapper.dynamiduserid(dyid,userid);
    }

    /**
     * 点赞
     * status为0执行点赞 status为1 执行取消点赞
     * @param status
     * @param dynamicId
     * @return
     */
    public Map<String, Object> dianZan(Integer status, Integer dynamicId) {
        Map<String,Object> map = new HashMap<String, Object>();
        Dynamic dynamic = dynamicMapper.selectByPrimaryKey(dynamicId);
        if(status==0){
            dynamic.setUpcount(dynamic.getUpcount()+1);
        }else if(status==1&&dynamic.getUpcount()>0){
            dynamic.setUpcount(dynamic.getUpcount()-1);
        }else{
            map.put("code",400);
            map.put("msg","未知错误");
            return map;
        }
        dynamicMapper.updateByPrimaryKey(dynamic);
        map.put("code",200);
        map.put("msg","操作成功");
        map.put("upcount",dynamic.getUpcount());
        return map;
    }

    @Override
    public List<Dynamic> findallDynamic(int userid) {
        return dynamicMapper.findallDynamic(userid);
    }

}
