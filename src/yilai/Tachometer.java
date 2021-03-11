package yilai;

public class Tachometer {
    private int time=5;
    public Tachometer(){}
    public Tachometer(int a){this.time=a;}

    public void chaKan(Car car){
        float carSpeed=car.getSpeed();
        float carTime=100/carSpeed;
        if(time<=carTime){
            System.out.println("请保持车速,祝你一路平安!");
        }else{
            System.out.println("检测到你以超速,警车出动!");
            PoliceCar pc = new PoliceCar(26);
            pc.carChase(car);
        }
    }
}
