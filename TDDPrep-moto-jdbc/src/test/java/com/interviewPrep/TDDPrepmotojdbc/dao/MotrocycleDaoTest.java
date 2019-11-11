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

//        Create object //

        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2019");
        moto.setColor("Black");

//          Call the method under test and pass the newly made object "moto" //
        moto = dao.addMotorcycle(moto);

//          Create a new object that will be used to compare to the original moto //
        Motorcycle compareMotoObject = dao.getMotorcycle(moto.getId());

//          This line compares the two objects made to see if they are equal //
        assertEquals(moto, compareMotoObject);

//          This line of code deletes the first motorcycle that was made. //
        dao.deleteMotorcycle(moto.getId());


//          This line should pass a null value to to the compare object //
        compareMotoObject = dao.getMotorcycle(moto.getId());

//          This line checks to see if the comparing object is is null as expected //
        assertNull(compareMotoObject);

    }

    @Test
    public void getAllMotorcycle(){

// Adding two motorcycles that will go into the list that will be testeding the getAll method.

        Motorcycle moto = new Motorcycle();
        moto.setVin("12345");
        moto.setMake("Honda");
        moto.setModel("Africa Twin");
        moto.setYear("2019");
        moto.setColor("Black");

        moto = dao.addMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("22345");
        moto.setMake("2Honda");
        moto.setModel("2Africa Twin");
        moto.setYear("22019");
        moto.setColor("2Black");

        moto = dao.addMotorcycle(moto);

// Adding two motorcycles that will go into the list that will be testeding the getAll method.
        List<Motorcycle> motorcycleList = dao.getAllMotorcycles();

//  Checking to see if the two motorcycles went into the database
        assertEquals(2,motorcycleList.size());





    }
}