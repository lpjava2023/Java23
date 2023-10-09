package com.itheima.exception;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class ExceptionDemo4 {
    /*
        子类重写父类方法时，不能抛出父类没有的异常，或者比父类更大的异常
     */
}
class Fu{
    public void show() {

    }
}
class Zi extends Fu{
    @Override
    public void show(){

    }
}