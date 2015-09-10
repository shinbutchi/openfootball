package com.shin.spring.openfootball.dao.entity;

public class Tags {
    private int id;
    private String key;
    private String slug;
    private String name;
    private int grade;
    private Integer parentId;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

        Tags tags = (Tags) o;

        if (id != tags.id) return false;
        if (grade != tags.grade) return false;
        if (key != null ? !key.equals(tags.key) : tags.key != null) return false;
        if (slug != null ? !slug.equals(tags.slug) : tags.slug != null) return false;
        if (name != null ? !name.equals(tags.name) : tags.name != null) return false;
        if (parentId != null ? !parentId.equals(tags.parentId) : tags.parentId != null) return false;
        if (createdAt != null ? !createdAt.equals(tags.createdAt) : tags.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(tags.updatedAt) : tags.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + grade;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
