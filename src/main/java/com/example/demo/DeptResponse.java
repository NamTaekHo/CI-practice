package com.example.demo;

public class DeptResponse {

    private long id;
    private String dept_cd;
    private String dept_nm;
    private int level;
    private String rel_dept_cd;
    private String rel_dept_nm;

    public long getId() {
        return id;
    }

    public String getDept_cd() {
        return dept_cd;
    }

    public String getDept_nm() {
        return dept_nm;
    }

    public int getLevel() {
        return level;
    }

    public String getRel_dept_cd() {
        return rel_dept_cd;
    }

    public String getRel_dept_nm() {
        return rel_dept_nm;
    }

    public DeptResponse(long id, String dept_cd, String dept_nm, int level, String rel_dept_cd, String rel_dept_nm) {
        this.id = id;
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.level = level;
        this.rel_dept_cd = rel_dept_cd;
        this.rel_dept_nm = rel_dept_nm;
    }
}
