package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;

import java.util.List;

public interface MotrocycleDao {
    /**
     * Getting one motorcycle for the given id from the database
     * @param id
     * @return Motorcycle
     */
    Motorcycle getMotorcycle(int id);

    /**
     * Get all the motorcycles in the database
     * @return
     */
    List<Motorcycle> getAllMotorcycles();

    /**
     * Adds a motorcycle to the database
     * @return
     */
    Motorcycle addMotorcycle(Motorcycle motorcycle);

    /**
     * Updates the motorcycle with the matching id in the database
     * Motorcycle object
     * @param motorcycle
     */
    void updateMotorcycle(Motorcycle motorcycle);

    /**
     *
     * Deletes the Motorcycle matching the given id
     * @param id
     */
    void deleteMotorcycle(int id);

    /**
     * Get all Motorcycles with the given make
     * @param make
     * @return
     */
    List<Motorcycle> getMotorcyleByMake(String make);
}
