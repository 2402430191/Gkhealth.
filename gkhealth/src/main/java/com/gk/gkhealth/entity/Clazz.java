package com.gk.gkhealth.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Clazz {
    private int id;
    private Integer clazzId;
    private String clazzName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "clazz_id")
    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    @Basic
    @Column(name = "clazz_name")
    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return id == clazz.id &&
                Objects.equals(clazzId, clazz.clazzId) &&
                Objects.equals(clazzName, clazz.clazzName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clazzId, clazzName);
    }
}
