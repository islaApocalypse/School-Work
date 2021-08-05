
package animal;

public class Cat extends Animal{
    private String type = "Cat";
    
    public Cat(String name) {
        super(name);
        super.SetType(type);
        super.SetAge(super.randNum.nextInt(12) + 1); // 1 - 10
    }
}