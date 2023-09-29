package com.itheima.design.adapter;

public class AdapterTest2 {
    /*
        适配器设计模式：解决接口与接口实现类之间的矛盾
     */
    public static void main(String[] args) {

    }
}
interface 和尚{
    void 念经();
    void 打坐();
    void 撞钟();
    void 习武();
}
//此处使用abstract，抽象类不能实例化（为了不让所创建的对象调用这些空方法）
abstract class 和尚Adapter implements 和尚{

    @Override
    public void 念经() {

    }

    @Override
    public void 打坐() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}
class 鲁智深 extends 和尚Adapter{
    @Override
    public void 习武() {
        System.out.println("黑马学java");
    }
}
class 唐僧 extends 和尚Adapter{
    @Override
    public void 念经() {
        super.念经();
    }

    @Override
    public void 打坐() {
        super.打坐();
    }

    @Override
    public void 撞钟() {
        super.撞钟();
    }
}