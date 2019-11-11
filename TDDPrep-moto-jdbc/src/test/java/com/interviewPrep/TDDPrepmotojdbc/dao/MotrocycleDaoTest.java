package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MotrocycleDaoTest {

    @Autowired
    protected MotrocycleDao dao;

    @Before
    public void setUp() throws Exception {

        List<Motorcycle> motorcycleList = dao.getAllMotorcycles();

        motorcycleList.stream().forEach(motorcycle -> dao.deleteMotorcycle(motorcycle.getId()));

        }

    @Test
    public void addGetDeleteMotorcycle() {
        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2019");
        moto.setColor("Black");

        moto = dao.addMotorcycle(moto);
        Motorcycle compareMotoObject = dao.getMotorcycle(moto.getId());

        assertEquals(moto, compareMotoObject);

        dao.deleteMotorcycle(moto.getId());

        compareMotoObject = dao.getMotorcycle(moto.getId());

        assertNull(compareMotoObject);

    }
}