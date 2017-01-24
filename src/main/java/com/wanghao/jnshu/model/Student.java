package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Student {
    long id;
    String photo;
    String name;
    String type;
    String synopsis;

    public Student(long id, String photo, String name, String type, String synopsis) {
        this.id = id;
        this.photo = photo;
        this.name = name;
        this.type = type;
        this.synopsis = synopsis;
    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
