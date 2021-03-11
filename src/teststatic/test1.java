package teststatic;

public class test1 {
private static final int TEST1_NUMBER=0 ;
private static final int TEST1_NUMBER1=1;
private static final int TEST_NUMBER3=2;

    public void buingBooks(int a,float money){
        switch(a){
            case test1.TEST1_NUMBER:
                System.out.println("尊敬的VIP高级用户你需付金额为:"+money*0.5);
                break;
            case test1.TEST1_NUMBER1:
                System.out.println("尊敬的VIP普通用户你需付金额为:"+money*0.8);
                break;
            case test1.TEST_NUMBER3:
                System.out.println("尊敬的用户你需付金额为:"+money);
                break;
            default:
                System.out.println("--------查询不到!----------");
                break;
        }
    }


   public static void main(String[] args){
        test.liFa(3);
//      test t = new test();
//      t.liFa(2);
//      test1 D = new test1();
//      D.buingBooks(1,100);
//       switch(5){
//           case test.TEST_USER:
//               System.out.println("尊贵的高级VIP客户你需付:"+test.TEST_MONEY*0.5);
//               break;
//           case test.TEST_USER1:
//               System.out.println("尊贵的普通VIP客户你需付:"+test.TEST_MONEY*0.8);
//               break;
//
//           case test.TEST_USER2:
//               System.out.println("尊贵的客户你需付:"+test.TEST_MONEY);
//               break;
//           default:
//               System.out.println("查询出错!");
//               break;
//       }

   }
}
