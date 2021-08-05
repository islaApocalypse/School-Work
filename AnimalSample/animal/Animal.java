
package animal;

import java.util.Random;

public abstract class Animal {
    protected Random randNum = new Random();
    private int age;
    private String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    } // constructor

    // setters - accessors
    public int GetAge() {
        return this.age;
    }
    public String GetName() {
        return this.name;
    }
    public String GetType() {
        return this.type;
    }

    // getters - mutators
    public void SetAge(int age) {
        this.age = age;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public void SetType(String type) {
        this.type = type;
    }

} // class