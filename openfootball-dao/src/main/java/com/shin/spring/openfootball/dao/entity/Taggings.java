package com.shin.spring.openfootball.dao.entity;

public class Taggings {
    private int id;
    private int tagId;
    private int taggableId;
    private String taggableType;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getTaggableId() {
        return taggableId;
    }

    public void setTaggableId(int taggableId) {
        this.taggableId = taggableId;
    }

    public String getTaggableType() {
        return taggableType;
    }

    public void setTaggableType(String taggableType) {
        this.taggableType = taggableType;
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

        Taggings taggings = (Taggings) o;

        if (id != taggings.id) return false;
        if (tagId != taggings.tagId) return false;
        if (taggableId != taggings.taggableId) return false;
        if (taggableType != null ? !taggableType.equals(taggings.taggableType) : taggings.taggableType != null)
            return false;
        if (createdAt != null ? !createdAt.equals(taggings.createdAt) : taggings.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(taggings.updatedAt) : taggings.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tagId;
        result = 31 * result + taggableId;
        result = 31 * result + (taggableType != null ? taggableType.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
