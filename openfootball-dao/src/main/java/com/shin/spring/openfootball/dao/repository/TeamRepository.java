package com.shin.spring.openfootball.dao.repository;

import com.shin.spring.openfootball.dao.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shin on 9/11/2015.
 */
public interface TeamRepository extends JpaRepository<Teams, String> {
    public Teams findFirstById(String teamId);
}
