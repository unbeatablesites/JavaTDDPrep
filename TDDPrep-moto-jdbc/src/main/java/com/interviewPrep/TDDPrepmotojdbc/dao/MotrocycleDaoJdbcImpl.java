package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class MotrocycleDaoJdbcImpl implements MotrocycleDao {

    private static final String INSERT_MOTO_SQL =
            "insert into car (make, model, year, color) values (?, ?, ?, ?)";

    private static final String SELECT_MOTO_SQL =
            "select * from car where id = ?";

    private static final String SELECT_ALL_MOTO_SQL =
            "select * from car";

    private static final String DELETE_MOTO_SQL =
            "delete from car where id = ?";

    private static final String UPDATE_MOTO_SQL =
            "update car set make = ?, model = ?, year = ?, color = ? where id = ?";

    private static final String SELECT_MOTO_BY_MAKE_SQL =
            "select * from car where make = ?";

    private static final String SELECT_MOTO_BY_COLOR_SQL =
            "select * from car where color = ?";

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

    /**
     * Maps table row to Motorcycle object
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    private Motorcycle mapRowToMotorcycle(ResultSet rs, int rowNum) throws SQLException{
        Motorcycle moto = new Motorcycle();
        moto.setId(rs.getInt("id"));
        moto.setVin(rs.getString("vin"));
        moto.setMake(rs.getString("make"));
        moto.setModel(rs.getString("model"));
        moto.setYear(rs.getString("year"));
        moto.setColor(rs.getString("color"));

        return moto;
    }
}
