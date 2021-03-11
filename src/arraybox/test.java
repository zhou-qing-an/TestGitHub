package arraybox;

public class test {
    public static void main(String[] args){
        ArrayBox ab= new ArrayBox(7);
        for(int i=1;i<9;i++){
            ab.cun(i);
        }
        ab.shanChu(6);
        ab.qv();
    }

}
