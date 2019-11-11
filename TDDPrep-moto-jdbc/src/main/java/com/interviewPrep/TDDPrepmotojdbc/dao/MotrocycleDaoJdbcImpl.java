package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MotrocycleDaoJdbcImpl implements MotrocycleDao {
    /**
     * Getting one motorcycle for the given id from the database
     *
     * @param id
     * @return Motorcycle
     */
    @Override
    public Motorcycle getMotorcycle(int id) {
        return null;
    }

    /**
     * Get all the motorcycles in the database
     *
     * @return
     */
    @Override
    public List<Motorcycle> getAllMotorcycles() {
        return null;
    }

    /**
     * Adds a motorcycle to the database
     *
     * @param motorcycle
     * @return
     */
    @Override
    public Motorcycle addMotorcycle(Motorcycle motorcycle) {
        return null;
    }

    /**
     * Updates the motorcycle with the matching id in the database
     * Motorcycle object
     *
     * @param motorcycle
     */
    @Override
    public void updateMotorcycle(Motorcycle motorcycle) {

    }

    /**
     * Deletes the Motorcycle matching the given id
     *
     * @param id
     */
    @Override
    public void deleteMotorcycle(int id) {

    }

    /**
     * Get all Motorcycles with the given make
     *
     * @param make
     * @return
     */
    @Override
    public List<Motorcycle> getMotorcyleByMake(String make) {
        return null;
    }
}
