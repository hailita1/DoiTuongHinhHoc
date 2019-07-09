package hailit;

public class CircleTest {
    public static void main(String[] args) {
        Cirlce circle = new Cirlce();
        System.out.println(circle);

        circle = new Cirlce(3.5);
        System.out.println(circle);

        circle = new Cirlce(3.5, "indigo", false);
        System.out.println(circle);
    }
}
