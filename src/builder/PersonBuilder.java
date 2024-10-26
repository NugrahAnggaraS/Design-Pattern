package builder;

// file PersonBuilder.java
public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    private String position;
    private double salary;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this; 
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public PersonBuilder setPosition(String position) {
        this.position = position;
        return this;
    }
    public PersonBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }   
    
    public Person build(){
        return new Person(
            this.name,
            this.age,
            this.address,
            this.position,
            this.salary
        );
    }
}