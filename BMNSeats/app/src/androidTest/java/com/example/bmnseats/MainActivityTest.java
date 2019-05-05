package com.example.bmnseats;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    private ActivityTestRule<MainActivity> MAinactivity_Test= new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity Main_Activity=null;
    @Before
    public void setUp() throws Exception {
    }


    @After
    public void tearDown() throws Exception {
        Main_Activity=null;

    }
}