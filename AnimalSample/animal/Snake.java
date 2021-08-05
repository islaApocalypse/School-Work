
package animal;

public class Snake extends Animal {
    private String type = "Snake";
    
    public Snake(String name) {
        super(name);
        super.SetType(type);
        super.SetAge(super.randNum.nextInt(20) + 1); // 1 - 10
    }
}