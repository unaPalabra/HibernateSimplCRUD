package com.example.hibernatesimplcrud.repository;

import com.example.hibernatesimplcrud.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
// Здесь можно добавить дополнительные методы для запросов к базе данных, если необходимо
}
