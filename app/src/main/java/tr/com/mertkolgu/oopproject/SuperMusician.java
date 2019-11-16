package tr.com.mertkolgu.oopproject;

public class SuperMusician {

    // Encapsulation
    private String name;
    private String instrument;
    private int age;

    SuperMusician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, String password) {
        if (password.matches("Mert")) {
            this.age = age;
        }
    }
}
