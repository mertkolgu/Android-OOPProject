package tr.com.mertkolgu.oopproject;

public class Dog extends Animal {

    void test() {
        super.sing();
    }

    public void sing() {
        System.out.println("Dog Class");
    }
}
