package Dog;
import java.lang.*;
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rock", 3);
        Dog d2 = new Dog("Sofi", 6);
        Dog d3 = new Dog("Bobick", 7);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
