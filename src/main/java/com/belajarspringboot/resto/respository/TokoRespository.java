package com.belajarspringboot.resto.respository;

import com.belajarspringboot.resto.model.Toko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokoRespository extends JpaRepository<Toko, Integer> {
}