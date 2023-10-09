package com.itheima.domain;

import com.itheima.exception.StudentAgeException;

import java.util.Scanner;

public class Student1 {
    private String name;
    private int age;
    private int mathScore;
    private int wenScore;
    private int englishScore;

    public Student1() {
    }

    public Student1(String name, int age, int mathScore, int wenScore, int englishScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.wenScore = wenScore;
        this.englishScore = englishScore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if (age>=0&&age<=120){
            this.age = age;
        }else{
            throw new StudentAgeException("输入错误，请重新输入0~120");
        }
    }

    /**
     * 获取
     * @return mathScore
     */
    public int getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     * @param mathScore
     */
    public void setMathScore(int mathScore) {
        if(mathScore>=0&&mathScore<=100){
            this.mathScore = mathScore;
        }else {

        }

    }

    /**
     * 获取
     * @return wenScore
     */
    public int getWenScore() {
        return wenScore;
    }

    /**
     * 设置
     * @param wenScore
     */
    public void setWenScore(int wenScore) {
        if(wenScore>=0&&wenScore<=100){
            this.wenScore = wenScore;
        }else {

        }

    }

    /**
     * 获取
     * @return englishScore
     */
    public int getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     * @param englishScore
     */
    public void setEnglishScore(int englishScore) {
        if(englishScore>=0&&englishScore<=100){
            this.englishScore = englishScore;
        }else {

        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", mathScore = " + mathScore + ", wenScore = " + wenScore + ", englishScore = " + englishScore + "}";
    }
}
