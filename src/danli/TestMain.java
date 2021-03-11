package danli;

public class TestMain {

    public static void main(String[] args){
            TestSingleTon t = TestSingleTon.getSingle();
            TestSingleTon t1=TestSingleTon.getSingle();

        System.out.println(t==t1);
        System.out.println(t.equals(t1));
        System.out.println(t);
        System.out.println(t1);


    }

}
