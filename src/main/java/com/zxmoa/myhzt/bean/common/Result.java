package com.zxmoa.myhzt.bean.common;


public class Result {
    //状态码
    public String code;
    //接口信息解释
    public String message;
    //接口返回对象
    public Object obj;
    //每页显示多少条记录
    private int pagesize;
    //一共多少页
    private int pagenum;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public Result(String code, String message, Object obj, int pagesize, int pagenum) {
        this.code = code;
        this.message = message;
        this.obj = obj;
        this.pagesize = pagesize;
        this.pagenum = pagenum;
    }
}
