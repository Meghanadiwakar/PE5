/*Create a Student class that represents the following information
of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/


package com.stackroute.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {
    private MainTest test;

    @Before
    public void setUp() throws Exception {
        test = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }
//test for success//
    @Test
    public void sortStudentsSuccess() {
        List<Student> input = new ArrayList<>();
        Student ob1 = new Student(123, "Jack", 22);
        Student ob2 = new Student(184, "Paul", 23);
        Student ob3 = new Student(409, "Ria", 21);
        Student ob4 = new Student(116, "Rohan", 28);
        Student ob5 = new Student(234, "Sahil", 22);

        input.add(ob1);
        input.add(ob2);
        input.add(ob3);
        input.add(ob4);
        input.add(ob5);

        List<Student> expectedresult = new ArrayList<>();
        expectedresult.add(ob4);
        expectedresult.add(ob2);
        expectedresult.add(ob1);
        expectedresult.add(ob5);
        expectedresult.add(ob3);

        List<Student> actualresult = test.SortStudents(input);
        assertEquals(expectedresult,actualresult);
    }
//test for failure//
    @Test
    public void sortStudentsFailure() {
        List<Student> input = new ArrayList<>();
        Student ob1 = new Student(123, "Jack", 22);
        Student ob2 = new Student(184, "Paul", 23);
        Student ob3 = new Student(409, "Ria", 21);
        Student ob4 = new Student(116, "Rohan", 28);
        Student ob5 = new Student(234, "Sahil", 22);

        input.add(ob1);
        input.add(ob2);
        input.add(ob3);
        input.add(ob4);
        input.add(ob5);

        List<Student> expectedresult = new ArrayList<>();
        expectedresult.add(ob1);
        expectedresult.add(ob2);
        expectedresult.add(ob3);
        expectedresult.add(ob4);
        expectedresult.add(ob5);

        List<Student> actualresult = test.SortStudents(input);
        assertNotEquals(expectedresult,actualresult);
    }
//test for null//
    @Test
    public void sortStudentsForNull(){
        List<Student> input = null;
        List<Student> actualresult = test.SortStudents(input);
        assertNull(null,actualresult);
    }
}

