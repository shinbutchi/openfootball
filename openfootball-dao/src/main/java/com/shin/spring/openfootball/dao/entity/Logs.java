package com.shin.spring.openfootball.dao.entity;

public class Logs {
    private int id;
    private String msg;
    private String level;
    private String app;
    private String tag;
    private Integer pid;
    private Integer tid;
    private String ts;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Logs logs = (Logs) o;

        if (id != logs.id) return false;
        if (msg != null ? !msg.equals(logs.msg) : logs.msg != null) return false;
        if (level != null ? !level.equals(logs.level) : logs.level != null) return false;
        if (app != null ? !app.equals(logs.app) : logs.app != null) return false;
        if (tag != null ? !tag.equals(logs.tag) : logs.tag != null) return false;
        if (pid != null ? !pid.equals(logs.pid) : logs.pid != null) return false;
        if (tid != null ? !tid.equals(logs.tid) : logs.tid != null) return false;
        if (ts != null ? !ts.equals(logs.ts) : logs.ts != null) return false;
        if (createdAt != null ? !createdAt.equals(logs.createdAt) : logs.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(logs.updatedAt) : logs.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (app != null ? app.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (ts != null ? ts.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
