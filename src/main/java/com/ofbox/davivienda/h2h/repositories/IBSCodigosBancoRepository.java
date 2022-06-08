package com.ofbox.davivienda.h2h.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofbox.davivienda.h2h.entities.BSCodigosBanco;

@Repository
public interface IBSCodigosBancoRepository extends JpaRepository<BSCodigosBanco, Long>{

}
