package com.zking.entity;

import java.io.Serializable;

/**
 * @author: longyt
 * @create: 2018-03-05 18:06
 * @desc:
 **/
public class testEntity implements Serializable{

    private Integer sid;

    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "testEntity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
