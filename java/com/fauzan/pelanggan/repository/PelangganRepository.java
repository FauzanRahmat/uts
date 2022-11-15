/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.pelanggan.repository;

import com.fauzan.pelanggan.entity.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public interface PelangganRepository extends JpaRepository<Pelanggan, Long>{
    
    public Pelanggan findByPelangganId(Long pelangganId);

  
}