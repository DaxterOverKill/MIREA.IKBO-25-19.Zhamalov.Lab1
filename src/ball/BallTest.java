package ball;
import java.lang.*;
public class BallTest {
    public static void main(String[] args) {
        Ball d1 = new Ball("red", 50);
        Ball d2 = new Ball("green", 25);
        Ball d3 = new Ball("yellow", 30);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoBallFit();
        d2.intoBallFit();
        d3.intoBallFit();
    }
}
