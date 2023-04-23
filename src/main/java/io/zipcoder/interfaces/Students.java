package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    public final static Students INSTANCE = new Students();

    private Students(){
        add(new Student(0, "Bats"));
        add(new Student(1, "Scarlet"));
        add(new Student(2, "Devlin"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
