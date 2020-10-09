package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.House;
import com.cone.yang.assets.user.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

@org.springframework.stereotype.Repository
public interface StockRepository extends JpaRepository<Stock, UUID> {

}
