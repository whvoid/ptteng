package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Cooperate {
    long id;
    String logo;
    String link;

    public Cooperate() {
    }

    public Cooperate(long id, String logo, String link) {
        this.id = id;
        this.logo = logo;
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Cooperate{" +
                "id=" + id +
                ", logo='" + logo + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
