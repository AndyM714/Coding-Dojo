package com.andy.safetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andy.safetravels.models.Expense;


@Repository
public interface ExpenceRepository extends CrudRepository<Expense, Long>{
    List<Expense> findAll();
}