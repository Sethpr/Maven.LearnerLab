package io.zipcoder.interfaces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class InstructorTest {
    Instructor t;
    Student[] s;

    @Before
    public void setup(){
        t = new Instructor(0, "Quartz");
        s = new Student[]{new Student(0, "Bats"), new Student(1, "Devlin")};
    }


    @Test
    public void testImplementation() {
        assertTrue(t instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        assertTrue(t instanceof Person);
    }

    @Test
    public void testLecture() {
        double expected = 5.0;
        t.teach(s[1], expected);

        double actual = s[1].getTotalStudyTime();

        assertEquals(expected, actual, 0.00002);
    }

    @Test
    public void testTeach() {
        double expected = 5.0;
        t.lecture(s, expected);

        double actual1 = s[1].getTotalStudyTime();
        double actual0 = s[0].getTotalStudyTime();


        assertEquals(expected, actual1, 0.00002);
        assertEquals(expected, actual0, 0.00002);
    }
}
