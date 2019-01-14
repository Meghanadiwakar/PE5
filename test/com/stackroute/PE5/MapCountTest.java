/*Write a program to find the number of
counts in the following String . Store the output in
Map< String ,Integer> as key value pair.*/

package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapCountTest {
    MapCount test;

    @Before
    public void setUp() throws Exception {
        test = new MapCount();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }
    //test for success//
    @Test
    public void CountsSuccess(){
        Map<String,Integer> expectedmap = new HashMap<>();
        expectedmap.put("one",5);
        expectedmap.put("two",2);
        expectedmap.put("three",2);

        Map<String,Integer> resultmap = test.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertEquals(expectedmap,resultmap);
    }
//test for failure//
    @Test
    public void CountsFailure(){
        Map<String,Integer> expectedmap = new HashMap<>();
        expectedmap.put("one",1);
        expectedmap.put("two",1);
        expectedmap.put("three",2);

        Map<String,Integer> resultmap = test.numberOfCounts("one one -one___two,,three,one @three*one?two");
        assertNotEquals(expectedmap,resultmap);
    }
//test for null//
    @Test
    public void CountsForNull(){
        Map<String,Integer> resultmap = test.numberOfCounts(null);
        assertNull(null,resultmap);
    }
}
