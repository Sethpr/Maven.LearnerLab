package io.zipcoder.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person p;

    @Before
    public void setup(){
        p = new Person(5, "Corey");
    }

    @Test
    public void testGetId() {
        long expected = 5;

        long actual = p.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        String expected = "Corey";

        String actual = p.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        String expected = "";

        p.setName(expected);
        String actual = p.getName();

        assertEquals(expected, actual);

    }
}
