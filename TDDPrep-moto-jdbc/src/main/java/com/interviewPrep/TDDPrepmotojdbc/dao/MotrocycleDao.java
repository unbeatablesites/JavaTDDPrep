package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;

import java.util.List;

public interface MotrocycleDao {
    /**
     * Getting one motorcycle for the given id
     * @param id
     * @return Motorcycle
     */
    Motorcycle getMotorcycloe(int id);

    /**
     * Get all the motorcycles
     * @return
     */
    List<Motorcycle> getAllMotorcycles();

    /**
     * Add a motorcycle
     * @return
     */
    Motorcycle addmotorcycle();



}
