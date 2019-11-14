package com.example.demo.domain;

import javax.persistence.*;

@Table(name = "`user`")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "useraddressid")
    private Integer useraddressid;

    @Column(name = "fileglid")
    private String fileglid;

    @Column(name = "sex")
    private String sex;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return useraddressid
     */
    public Integer getUseraddressid() {
        return useraddressid;
    }

    /**
     * @param useraddressid
     */
    public void setUseraddressid(Integer useraddressid) {
        this.useraddressid = useraddressid;
    }

    /**
     * @return fileglid
     */
    public String getFileglid() {
        return fileglid;
    }

    /**
     * @param fileglid
     */
    public void setFileglid(String fileglid) {
        this.fileglid = fileglid;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
}