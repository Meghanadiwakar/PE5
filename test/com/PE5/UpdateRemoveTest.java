package com.PE5;
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

    @Test
    public void editlist()
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

    }


