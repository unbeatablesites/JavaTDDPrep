package com.interviewPrep.TDDPrepmotojdbc.dao;

import com.interviewPrep.TDDPrepmotojdbc.dto.Motorcycle;

public interface MotrocycleDao {
    /**
     * Getting one motorcycle for the given id
     * @param id
     * @return Motorcycle
     */
    Motorcycle getMotorcycloe(int id);

}
