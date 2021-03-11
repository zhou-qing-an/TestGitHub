package teststatic;

import yilai.Car;

public class test extends Car {
    public static final float TEST_MONEY=25;
    public static final  int  TEST_USER=0;
    public static final  int  TEST_USER1=1;
    public static final  int  TEST_USER2=2;
    //理发店  理发
    //高级VIP
    //普通VIP
    //木有VIP

    public static void liFa(int a){
        switch(a){
            case test.TEST_USER:
                System.out.println("尊贵的高级VIP客户你需付:"+test.TEST_MONEY*0.5);
                break;
            case test.TEST_USER1:
                System.out.println("尊贵的普通VIP客户你需付:"+test.TEST_MONEY*0.8);
                break;

            case test.TEST_USER2:
                System.out.println("尊贵的客户你需付:"+test.TEST_MONEY);
                break;
            default:
                System.out.println("查询出错!");
                break;
        }

    }



}
