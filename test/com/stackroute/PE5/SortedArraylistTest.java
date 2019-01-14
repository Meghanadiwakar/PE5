/*Write a program to implement set interface which sorts the given randomly
 *ordered names inascending order. Convert the sorted set in to an  array list
 *Input : Harry  Olive  Alice  Bluto  Eugene
 *Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
 *Array list  from Set :  Alice Bluto Eugene Harry Olive
 */

package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedArraylistTest {
    SortedArraylist list;
    @Before
    public void setUp() throws Exception {
        list = new SortedArraylist();
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }
    /* test Success*/
    @Test
    public void ListSuccess() {
        ArrayList<String> expected = new ArrayList<String>() {
            {
                add("Alice");
                add("Bluto");
                add("Eugene");
                add("Henry");
                add("Olive");
            }
        };
        String[] input = {"Henry","Olive","Alice","Bluto","Eugene"};
        ArrayList<String> actual = list.toSortArrayList(input);
        assertEquals(expected,actual);
    }
    /* method to test failure*/
    @Test
    public void Listfailure() {
        ArrayList<String> expected = new ArrayList<String>() {
            {
                add("Alice");
                add("Bluto");
                add("Eugene");
                add("Henry");
                add("Olive");
            }
        };
        String[] input = {"barry","Olive","henry","Bluto","alice"};
        ArrayList<String> actual = list.toSortArrayList(input);
        assertNotEquals(expected,actual);
    }

//test for null//
    @Test
    public void Listnull(){
        ArrayList<String> expected = null;
        String[] input = {};
        ArrayList<String> actual = list.toSortArrayList(input);
    }



}