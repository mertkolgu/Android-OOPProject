package tr.com.mertkolgu.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Mert", "Developer");
        System.out.println("Username : " + myUser.name);
        System.out.println(myUser.information());

        // Encapsulation
        SuperMusician james = new SuperMusician("James", "Guitar", 50);
        james.setAge(60, "Mert");
        System.out.println("SuperMusician Name : " + james.getName());
        System.out.println("SuperMusician Age : " + james.getAge());

        // Inheritance
        SubMusician lars = new SubMusician("Lars", "Violin", 47);
        System.out.println("SubMusician Name : " + lars.getName());
        System.out.println("SubMusician Sing : " + lars.sing());

        // Polymorphism
        // Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(1, 2));
        System.out.println(mathematics.sum(1, 2, 4));

        // Dynamic Polymorphism
        Animal animal = new Animal();
        animal.sing();  // Animal Class

        Dog dog = new Dog();
        dog.test(); // Animal Class
        dog.sing(); // Dog Class

        // Abstract & Interface
        Piano piano = new Piano();
        piano.brand = "Yamaha";
        piano.digital = true;
        piano.info();
    }
}
