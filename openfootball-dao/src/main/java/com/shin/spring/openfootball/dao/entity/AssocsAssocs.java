package com.shin.spring.openfootball.dao.entity;

public class AssocsAssocs {
    private int id;
    private int assoc1Id;
    private int assoc2Id;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssoc1Id() {
        return assoc1Id;
    }

    public void setAssoc1Id(int assoc1Id) {
        this.assoc1Id = assoc1Id;
    }

    public int getAssoc2Id() {
        return assoc2Id;
    }

    public void setAssoc2Id(int assoc2Id) {
        this.assoc2Id = assoc2Id;
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

        AssocsAssocs that = (AssocsAssocs) o;

        if (id != that.id) return false;
        if (assoc1Id != that.assoc1Id) return false;
        if (assoc2Id != that.assoc2Id) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + assoc1Id;
        result = 31 * result + assoc2Id;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
