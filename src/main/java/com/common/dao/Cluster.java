package com.common.dao;

/**
 * Created by lzz on 2018/9/11.
 */
public class Cluster {
    private  int id;
    private String name;

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

    @Override
    public String toString() {
        return "Cluster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
