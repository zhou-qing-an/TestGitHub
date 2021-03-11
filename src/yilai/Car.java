package yilai;

public class Car {
    private float speed=22.5f;

    public Car(){}
    public Car(float a){
        this.speed=a;
    }

    public float getSpeed(){ return this.speed; }


    public void judge(float speed1){
        if(this.speed<speed1){
            float time=100/(speed1-this.speed);
            try{
                Thread.sleep(2000);
            }catch(Exception j){
                j.printStackTrace();
            }
            System.out.println("经过"+time+"秒我被追到了,我发誓我没有喝酒,我只是腿抖!");
        }else{
            System.out.println("小样,就你这车速,回家在练两年!");
        }
    }

}
