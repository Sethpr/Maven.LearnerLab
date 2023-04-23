package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    public final static Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(0, "Quartz"));
        add(new Instructor(1, "Chernov"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
