package tr.com.mertkolgu.oopproject;

class SubMusician extends SuperMusician {

    // Inheritance
    SubMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    String sing() {
        return "Nothing";
    }
}
