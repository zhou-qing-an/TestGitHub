package yilai;

public class PoliceCar {
    private float policeSpeed=20;
    public PoliceCar(){}
    public PoliceCar(float s){ this.policeSpeed=s;}

    public float getPoliceSpeed(){return this.policeSpeed;}

    public void carChase(Car car){
        car.judge(policeSpeed);
    }

}
