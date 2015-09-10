package com.shin.spring.openfootball.dao.entity;

public class Zones {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zones zones = (Zones) o;

        if (id != zones.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
