public class Person {
    private String name;
    private String birthplace;
    private int age;

    public Person(String name, String birthplace, int age) {
        this.name = name;
        this.birthplace = birthplace;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public int getAge() {
        return age;
    }    

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public void haveABirthday() {
        age++;
    }
}