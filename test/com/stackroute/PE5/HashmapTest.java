/*Write a program where an array of strings is input and output is a
 *Map< String ,boolean> where each different  string  is a key and its
 *value is true if that  string  appears 2 or more times in the arrayInput :
 *String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 *Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */

package com.stackroute.PE5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class HashmapTest {
    Hashmap booleancount;
    @Before
    public void setUp() throws Exception {
        booleancount = new Hashmap();
    }

    @After
    public void tearDown() throws Exception {
        booleancount= null;
    }
   /*test for success*/
    @Test
    public void booleanCountSuccess() {
        Map<String,Boolean> expected = new HashMap<String,Boolean>() {
            {
                put("a",true);
                put("b",false);
                put("c",true);
                put("d",false);

            }
        };
        String arr[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> actual = booleancount.booleancountofword(arr);
        assertEquals(expected,actual);
    }
    /* test for failure
     */
    @Test
    public void CountFailure(){
        String arr[] = {"$","%","^"};
        assertNotNull(booleancount.booleancountofword(arr));
    }
//test for null//
    @Test
    public void Countnull(){
        String arr[] = {""};
        assertNotNull(booleancount.booleancountofword(arr));
    }

}


