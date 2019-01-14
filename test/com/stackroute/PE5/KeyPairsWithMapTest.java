/*Write a method that accepts a Map object having two key-value pairs with the
 *keys val1 and val2.Modify and return the given map as follows:
 *a. If the key `val1` has a value, set the key `val2` to have that value.
 *b. Set the key `val1` to have the value `"  "` (empty string ).
 *Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
 *Example 2:The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":"mars"}
 */

package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class KeyPairsWithMapTest {
    KeyPairsWithMap obj;
    @Before
    public void setUp() throws Exception {
        obj = new KeyPairsWithMap();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    /* test Success case Set the key
        value
     */
    @Test
    public void KeyValueSuccess() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "java");
        assertEquals(expectedValue,obj.toSetKeyValue(input));

    }
    /* test failure of updation of
        key value
     */
    @Test
    public void KeyValueMethodFailure() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "c++");
        assertNotEquals(expectedValue,obj.toSetKeyValue(input));

    }
    /* method to check when the input is null*/
    @Test
    public void KeyValueMethodNull() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", " ");
        input.put("val2", " ");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", " ");
        assertEquals(expectedValue,obj.toSetKeyValue(input));

    }

}

