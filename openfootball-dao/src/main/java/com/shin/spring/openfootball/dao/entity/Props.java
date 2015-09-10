package com.shin.spring.openfootball.dao.entity;

public class Props {
    private int id;
    private String key;
    private String value;
    private String kind;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

        Props props = (Props) o;

        if (id != props.id) return false;
        if (key != null ? !key.equals(props.key) : props.key != null) return false;
        if (value != null ? !value.equals(props.value) : props.value != null) return false;
        if (kind != null ? !kind.equals(props.kind) : props.kind != null) return false;
        if (createdAt != null ? !createdAt.equals(props.createdAt) : props.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(props.updatedAt) : props.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
