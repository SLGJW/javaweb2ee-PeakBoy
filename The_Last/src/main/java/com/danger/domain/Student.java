package com.danger.domain;

import com.danger.utils.DateUtil;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private Integer id;
    private String password;
    private String sname;
    private Date sdate;
    private String sdateStr;
    private Integer sdept;
    private Integer status;
    private String statusStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getSdateStr() {
        if (sdate != null){
            sdateStr = DateUtil.DateToString(sdate, "yyyy-MM-dd");
        }
        return sdateStr;
    }

    public void setSdateStr(String sdateStr) {
        this.sdateStr = sdateStr;
    }

    public Integer getSdept() {
        return sdept;
    }

    public void setSdept(Integer sdept) {
        this.sdept = sdept;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        if (status == 0){
            statusStr = "正常";
        }else if (status == 1){
            statusStr = "黑名单";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }
}
