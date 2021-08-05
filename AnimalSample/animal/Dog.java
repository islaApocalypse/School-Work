
package animal;

public class Dog extends Animal {
    private String type = "Dog";
    
    public Dog(String name) {
        super(name);
        super.SetType(type);
        super.SetAge(super.randNum.nextInt(10) + 1); // 1 - 10
    }
}