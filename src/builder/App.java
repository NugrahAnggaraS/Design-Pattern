package builder;

public class App {
    Person person1 = new PersonBuilder()
    .setName("angga")
    .setAge(19)
    .setAddress("gg rambutan")
    .build();

    Person person2 = new PersonBuilder()
    .setName("nugrah")
    .setAge(20)
    .setAddress("gg mangga")
    .setPosition("Manager")
    .setSalary(10000000)
    .build();


    Person person3 = new PersonBuilder()
    .setName("mamat")
    .setAge(14)
    .setAddress("gg jambu")
    .build();
}
