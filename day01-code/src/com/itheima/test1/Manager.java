package com.itheima.test1;

public class Manager extends Employee{
    private double input;

    public double getInput() {
        return input;
    }


    public void setIntput(double intput) {
        this.input= intput;
    }

    public Manager() {
    }

    public Manager(String name, int age, double salary,double input) {
        super(name, age, salary);
        this.input=input;
    }

    public void work(){
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+"工资为"+super.getSalary()+"奖金为"+input+"项目经理正在分配工作");
    }

}
