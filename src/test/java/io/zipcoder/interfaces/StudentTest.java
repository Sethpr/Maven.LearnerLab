package io.zipcoder.interfaces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student s;

    @Before
    public void setup(){
        s = new Student(0, "Bats");
    }


    @Test
    public void testImplementation() {
        assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance() {
        assertTrue(s instanceof Person);
    }


    @Test
    public void testLearn() {
        double expected = 5.0;
        s.learn(5);

        double actual = s.getTotalStudyTime();

        assertEquals(expected, actual, 0.0002);
    }
}
