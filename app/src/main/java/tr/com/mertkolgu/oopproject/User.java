package tr.com.mertkolgu.oopproject;

class User extends People {

    // Property
    String name;
    String job;

    // Constructor
    User(String name, String job) {
        this.name = name;
        this.job = job;

        System.out.println("User created!");
    }
}
