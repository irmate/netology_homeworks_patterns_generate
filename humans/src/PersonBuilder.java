public class PersonBuilder {
    private static PersonBuilder personBuilder = new PersonBuilder();
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        personBuilder.name = name;
        return personBuilder;
    }

    public PersonBuilder setSurname(String surname) {
        personBuilder.surname = surname;
        return personBuilder;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age is incorrect");
        }
        personBuilder.age = age;
        return personBuilder;
    }

    public PersonBuilder setAddress(String address) {
        personBuilder.address = address;
        return personBuilder;
    }

    public Person build() throws IllegalStateException {
        if (personBuilder.name == null) {
            throw new IllegalStateException("Name not set");
        }
        if (personBuilder.surname == null) {
            throw new IllegalStateException("Surname not set");
        }
        if (personBuilder.age == -1 && personBuilder.address == null) {
            return new Person(personBuilder.name, personBuilder.surname);
        }
        if (personBuilder.address == null) {
            return new Person(personBuilder.name, personBuilder.surname, personBuilder.age);
        }
        if (personBuilder.age == -1) {
            return new Person(personBuilder.name, personBuilder.surname, personBuilder.address);
        }
        return new Person(personBuilder.name, personBuilder.surname, personBuilder.age, personBuilder.address);
    }
}