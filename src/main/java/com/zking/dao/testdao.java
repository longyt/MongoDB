package com.zking.dao;

import com.zking.entity.testEntity;
import com.zking.util.EhcacheUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: longyt
 * @create: 2018-03-05 18:06
 * @desc:
 **/
public class testdao {

    //模拟缓存
    Map<Integer ,testEntity> cache=new HashMap<Integer, testEntity>();


    public testEntity load(testEntity test){
        testEntity testEntity=null;
        testEntity= (testEntity) EhcacheUtil.get("stuCache",test.getSid());
        System.out.println(testEntity);
        if(testEntity == null){
            testEntity=new testEntity();
            testEntity.setSid(test.getSid());
            testEntity.setSname("jk"+test.getSid());
            System.out.println("数据库查询");
        }
        if (testEntity!=null){
            //cache.put(test.getSid(),test);
            EhcacheUtil.put("stuCache",test.getSid(),test);
            System.out.println("添加到缓存中");
        }
        return testEntity;
    }

}
