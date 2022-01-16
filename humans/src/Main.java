public class Main {
    public static void main(String[] args) {
        Person father = new PersonBuilder()
                .setName("Jon")
                .setSurname("Baxter")
                .setAge(42)
                .setAddress("New York")
                .build();
        Person son = father.newChildBuilder()
                .setName("Jimmi")
                .build();
        System.out.println(father + " has son, " + son);

        try {
            Person mom = new PersonBuilder()
                    .setName("Janet")
                    .setAddress("New York")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person mom = new PersonBuilder()
                    .setName("Janet")
                    .setSurname("Baxter")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}