package com.zking;

import com.zking.dao.testdao;
import com.zking.entity.testEntity;
import org.junit.Test;

/**
 * @author: longyt
 * @create: 2018-03-05 18:15
 * @desc:
 **/
public class testCache {
    @Test
    public void cache(){
        testEntity testEntity=new testEntity();
        testEntity.setSid(1);
        testEntity.setSname("aa");
        testdao testdao=new testdao();
        com.zking.entity.testEntity load = testdao.load(testEntity);
        System.out.println(load.toString());
        com.zking.entity.testEntity load1 = testdao.load(testEntity);
        System.out.println(load.toString());
    }
}
