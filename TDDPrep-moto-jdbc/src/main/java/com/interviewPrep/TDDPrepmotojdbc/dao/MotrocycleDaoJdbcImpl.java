package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class MotrocycleDaoJdbcImpl implements MotrocycleDao {

    // Prepared statement strings

    private static final String INSERT_MOTO_SQL = "INSERT INTO MOTORCYCLE (VIN, MAKE, MODEL, YEAR, COLOR) VALUES (?,?,?,?,?)";

    private static final String SELECT_MOTO_SQL = "Select * from motorcycle where id = ?";


    /**
     * Getting one motorcycle for the given id from the database
     *
     * @param id
     * @return Motorcycle
     */
    @Override
    @Transactional
    public Motorcycle getMotorcycle(int id) {
        return null;
    }

    /**
     * Get all the motorcycles in the database
     *
     * @return
     */
    @Override
    @Transactional
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
    @Transactional
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
    @Transactional
    public void updateMotorcycle(Motorcycle motorcycle) {

    }

    /**
     * Deletes the Motorcycle matching the given id
     *
     * @param id
     */
    @Override
    @Transactional
    public void deleteMotorcycle(int id) {

    }

    /**
     * Get all Motorcycles with the given make
     *
     * @param make
     * @return
     */
    @Override
    @Transactional
    public List<Motorcycle> getMotorcyleByMake(String make) {
        return null;
    }
}
