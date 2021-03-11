package arraybox;

public class ArrayBox {
        private int[] time;
        public ArrayBox(){time =new int[10];}
        public ArrayBox(int lai){ time=new int[lai];}
        private int temp=0;
        //先做一个方法存元素
    public void cun(int a){
            boolean jurge =this.chaKan(temp);
        if(!jurge){
             this.kuoRou(temp);
        }
        //扩容过后再接收之前传入的元素!
            time[temp++]=a;

//            if(jurge){
//                time[temp++]=a;  这是必执行的所以放在if里面会有问题,应该放在扩容后必执行的一段!
//            }else{
//                this.kuoRou(temp);
//
//            }
    }
private void kuoRou(int a){
        int b=time.length<<2;
        int[] time2 = new int[b];
        if(a>b){
             time2 = new int[a];

        }
        time=this.cun(time2);
}
private int[] cun(int[] x){
        for(int i=0;i<time.length;i++){
            x[i]=time[i];
        }
        return x;
}
private boolean chaKan(int a){
            boolean b = a<time.length;
            return b;
}
//查看
   public void shanChu(int a){
        boolean v = false;
        for(int i=0;i<temp;i++){
            int x=time[i];
            if(x==a){
                v=true;
                System.out.println("你要删除的数存在数组中,它是:"+x);
                this.sc(i);
                break;
            }
        }
        if(!v){
            System.out.println("你要删除的数不存在数组中");
        }
    }

    private void sc(int a){
        for(int i=a;i<temp;i++){
            time[i]=time[i+1];
        }
        time[--temp]=0;

    }
    public void qv(){
        System.out.println("数组中的个数是:"+temp);
        for(int i=0;i<temp;i++){
            int x=time[i];
                System.out.println(x);

            }
        }



    }
//

