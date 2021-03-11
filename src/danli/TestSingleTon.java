package danli;

public class TestSingleTon {

//1,对象不能让用户自己创建
    private TestSingleTon(){}


    //2,对象在本类中创建,可以放在哪里创建?
    //  构造方法?   不行  就是不想让用户自己new对象才用private修饰构造方法!
    //  方法?       不行  返回的对象相当于用户自己创建的,要求只有唯一的对象
    //  块?         不行  没有返回值
    //  属性?

    private static TestSingleTon single ; //= new TestSingleTon();(饿汉式) 一开始就创建对象,不管用不用得着先加载

//  不行  返回的对象相当于用户自己创建的,new一次就出现创建一个;要求只有唯一的对象

//    public static TestSingleTon fanhui(){
//        return new TestSingleTon();
//    }

    public static TestSingleTon getSingle(){
        if(single==null){
            single=new TestSingleTon();//懒汉式  用到才加载,用不到就不加载,需要严谨的逻辑
        }
        return single;
    }


}
