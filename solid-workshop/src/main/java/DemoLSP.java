public class DemoLSP {
    public static void main(String[] args) {
        PersonGroup group1 = new PersonGroup(1, "A", 1);

        // Composition vs Inheritance ?
    }
}

class PersonGroup {
    Person person;
    int group;

    public PersonGroup(int id, String name, int group) {
        this.person = new Person(id, name);
        this.group = group;
    }
}

class PersonGroupV2 {
    Person person;
    int group;
    int department;

    public PersonGroupV2(int id, String name, int group) {
        this.person = new Person(id, name);
        this.group = group;
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}