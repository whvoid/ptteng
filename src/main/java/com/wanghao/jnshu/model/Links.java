package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Links {
    long id;
    String name;
    String link;

    public Links() {
    }

    public Links(long id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Links{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
