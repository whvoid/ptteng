package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Photos {
    long id;
    String photo;
    String link;

    public Photos() {
    }

    public Photos(long id, String photo, String link) {
        this.id = id;
        this.photo = photo;
        this.link = link;
    }
    public long getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getLink() {
        return link;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return "Photos{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
