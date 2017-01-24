package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Statistics {
    long studentNumber;
    long workNumber;

    public Statistics() {
    }

    public Statistics(long studentNumber, long workNumber) {
        this.studentNumber = studentNumber;
        this.workNumber = workNumber;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public long getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(long workNumber) {
        this.workNumber = workNumber;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "studentNumber=" + studentNumber +
                ", workNumber=" + workNumber +
                '}';
    }
}
