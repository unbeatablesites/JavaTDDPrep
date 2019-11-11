package com.interviewPrep.TDDPrepmotojdbc.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MotrocycleDaoTest {

    @Autowired
    protected MotrocycleDao dao;

    @Before
    public void setUp() throws Exception {

        System.out.println("Running Setup...");
    }

    @Test
    public void getMotorcycle() {
    }
}