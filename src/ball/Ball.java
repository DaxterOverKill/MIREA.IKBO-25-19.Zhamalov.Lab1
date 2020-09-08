package ball;
import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;

    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String name) {
        this.color = name;
    }
    public String getColor(String name){
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoBallFit(){
        System.out.println("In this basket will fit "+(1000/radius));
    }
}
