package com.example.hibernatesimplcrud.repository;

import com.example.hibernatesimplcrud.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
// Здесь можно добавить дополнительные методы для запросов к базе данных, если необходимо
}
