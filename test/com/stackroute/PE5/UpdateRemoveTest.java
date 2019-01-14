/*Write a Java program to update specific array element
by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/


package com.stackroute.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateRemoveTest {
    UpdateRemove obj;
    @Before
    public void setUp(){
        obj = new UpdateRemove();

    }

    @After
    public void tearDown(){
        obj = null;

    }
//test for success//
    @Test
    public void editlistsuccess()
    {
        List<String> result = new ArrayList<>();
        result.add("Apple");
        result.add("Grape");
        result.add("Melon");
        result.add("Berry");

        List<String> expectedList = new ArrayList<>();

            expectedList.add("Kiwi");
            expectedList.add("Grape");
            expectedList.add("Mango");
            expectedList.add("Berry");

        assertNotEquals(expectedList,obj.editlist(result,"Kiwi"));
    }

//test for failure of the list//
    @Test
    public void editlistfailure()
    {
        List<String> result = new ArrayList<>();
        result.add("Apple");
        result.add("Grape");
        result.add("Melon");
        result.add("Berry");

        List<String> expectedList = new ArrayList<>();

        expectedList.add("Apple");
        expectedList.add("Grape");
        expectedList.add("Melon");
        expectedList.add("Berry");

        assertEquals(expectedList,obj.editlist(result,"Kiwi"));
    }

//test for an empty list and null result//

    @Test
    public void editlistnull()
    {
        List<String> result = new ArrayList<>();
        result.add("");

        List<String> expectedList = new ArrayList<>();

        expectedList.add(null);

        assertNotEquals(expectedList,obj.editlist(result,"Kiwi"));
    }

}


