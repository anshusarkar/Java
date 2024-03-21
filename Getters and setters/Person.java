public class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Anshu");
        p.getName();
        p.age = 0; // Yeah I think you get the getters and setters by now ... and see why it's unnecessary ? :) cause I allocated p.age without getter and setters ...
        System.out.print(p.name+"'s age is ");
        System.out.print(p.age);

    }
}

