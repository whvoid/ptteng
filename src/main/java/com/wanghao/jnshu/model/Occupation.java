package com.wanghao.jnshu.model;

/**
 * Created by WangHao on 2017/1/24.
 */
public class Occupation {
    long id;
    String name;
    String synopsis;
    String threshold;
    String difficulty;
    String cycle;
    long needNumber;
    String salaryOne;
    String salaryTwo;
    String salaryThree;
    long studyNumber;
    String prompt;

    public Occupation() {
    }

    public Occupation(long id, String name, String synopsis, String threshold, String difficulty, String cycle, long needNumber, String salaryOne, String salaryTwo, String salaryThree, long studyNumber, String prompt) {
        this.id = id;
        this.name = name;
        this.synopsis = synopsis;
        this.threshold = threshold;
        this.difficulty = difficulty;
        this.cycle = cycle;
        this.needNumber = needNumber;
        this.salaryOne = salaryOne;
        this.salaryTwo = salaryTwo;
        this.salaryThree = salaryThree;
        this.studyNumber = studyNumber;
        this.prompt = prompt;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public long getNeedNumber() {
        return needNumber;
    }

    public void setNeedNumber(long needNumber) {
        this.needNumber = needNumber;
    }

    public String getSalaryOne() {
        return salaryOne;
    }

    public void setSalaryOne(String salaryOne) {
        this.salaryOne = salaryOne;
    }

    public String getSalaryTwo() {
        return salaryTwo;
    }

    public void setSalaryTwo(String salaryTwo) {
        this.salaryTwo = salaryTwo;
    }

    public String getSalaryThree() {
        return salaryThree;
    }

    public void setSalaryThree(String salaryThree) {
        this.salaryThree = salaryThree;
    }

    public long getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(long studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", threshold='" + threshold + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", cycle='" + cycle + '\'' +
                ", needNumber=" + needNumber +
                ", salaryOne='" + salaryOne + '\'' +
                ", salaryTwo='" + salaryTwo + '\'' +
                ", salaryThree='" + salaryThree + '\'' +
                ", studyNumber=" + studyNumber +
                ", prompt='" + prompt + '\'' +
                '}';
    }
}
