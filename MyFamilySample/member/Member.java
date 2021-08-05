
package member;


public abstract class Member {
    private String gender;
    private String name;
    private int age;

    public Member() {} // constructor

    // setters
    public String GetGender() {
        return this.gender;
    }
    public String GetName() {
        return this.name;
    }
    public int GetAge() {
        return this.age;
    }

    // getters
    public void SetGender(String gender) {
        this.gender = gender;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public void SetAge(int age) {
        this.age = age;
    }

} // class