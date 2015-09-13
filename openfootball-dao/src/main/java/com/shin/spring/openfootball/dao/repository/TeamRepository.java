package com.shin.spring.openfootball.dao.repository;

import com.shin.spring.openfootball.dao.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shin on 9/11/2015.
 */
@Repository
public interface TeamRepository extends JpaRepository<Teams, Integer> {
    Teams findFirstById(int teamId);
}
