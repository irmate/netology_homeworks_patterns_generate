public enum AgeInfo {
    KNOWN, UNKNOWN("Age unknown");

    private int age = -1;
    private String message;

    AgeInfo() {
    }

    AgeInfo(String message) {
        this.message = message;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        if (age >= 0) {
            return Integer.toString(age);
        } else {
            return message;
        }
    }
}