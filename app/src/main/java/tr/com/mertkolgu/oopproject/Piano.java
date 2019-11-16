package tr.com.mertkolgu.oopproject;

public class Piano implements Instrument, HouseDecor {

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("Override method");
    }
}
