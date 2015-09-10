package com.shin.spring.openfootball.dao.entity;

public class Places {
    private int id;
    private String name;
    private String kind;
    private Double lat;
    private Double lng;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
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

        Places places = (Places) o;

        if (id != places.id) return false;
        if (name != null ? !name.equals(places.name) : places.name != null) return false;
        if (kind != null ? !kind.equals(places.kind) : places.kind != null) return false;
        if (lat != null ? !lat.equals(places.lat) : places.lat != null) return false;
        if (lng != null ? !lng.equals(places.lng) : places.lng != null) return false;
        if (createdAt != null ? !createdAt.equals(places.createdAt) : places.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(places.updatedAt) : places.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
