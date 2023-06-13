package com.example.server.repository;

import com.example.server.data.entity.StreetLamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetLampRepository extends JpaRepository<StreetLamp, Long> {

    public List<StreetLamp> findByOrderById();

}
