public class Person {
    protected final String NAME;
    protected final String SURNAME;
    protected AgeInfo ageInfo;
    protected String address;

    public Person(String name, String surname) {
        this.NAME = name;
        this.SURNAME = surname;
        this.ageInfo = AgeInfo.UNKNOWN;
    }

    public Person(String name, String surname, int age) {
        this.NAME = name;
        this.SURNAME = surname;
        this.ageInfo = AgeInfo.KNOWN;
        ageInfo.setAge(age);
    }

    public Person(String name, String surname, String address) {
        this(name, surname);
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.NAME = name;
        this.SURNAME = surname;
        this.ageInfo = AgeInfo.KNOWN;
        ageInfo.setAge(age);
        this.address = address;
    }

    public boolean hasAge() {
        return ageInfo != AgeInfo.UNKNOWN;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return this.NAME;
    }

    public String getSurname() {
        return this.SURNAME;
    }

    public AgeInfo getAge() {
        return ageInfo;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            ageInfo.setAge(ageInfo.getAge() + 1);
        }
    }

    @Override
    public String toString() {
        return NAME + " " + SURNAME;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.SURNAME)
                .setAddress(this.address);
    }
}