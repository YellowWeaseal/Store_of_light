package com.example.server.repository;

import com.example.server.data.entity.Chandelier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChandelierRepository extends JpaRepository<Chandelier, Long> {

    public List<Chandelier> findByOrderById();

}
