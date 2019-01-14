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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String []args) {

        List<Student> students = new ArrayList<>();

        Student ob1 = new Student(123, "Jack", 22);
        Student ob2 = new Student(184, "Paul", 23);
        Student ob3 = new Student(409, "Ria", 21);
        Student ob4 = new Student(116, "Rohan", 28);
        Student ob5 = new Student(234, "Sahil", 22);

        students.add(ob1);
        students.add(ob2);
        students.add(ob3);
        students.add(ob4);
        students.add(ob5);

        Iterator it = students.iterator();
        while (it.hasNext()) {
            Student element = (Student) it.next();

        }
        MainTest obj = new MainTest();
        obj.SortStudents(students);
    }

    public List<Student> SortStudents(List<Student> s)
    {
        if(s==null)
            return null;
        Collections.sort(s,new StudentSorter());
        Iterator it1 = s.iterator();
        while (it1.hasNext()) {
            Student element = (Student) it1.next();

        }
        return s;
    }
}

