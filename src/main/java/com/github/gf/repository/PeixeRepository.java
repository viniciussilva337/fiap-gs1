package com.github.gf.repository;

import com.github.gf.model.Peixe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long> {


}
