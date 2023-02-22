package com.andy.safetravels.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.safetravels.models.Expense;
import com.andy.safetravels.repositories.ExpenceRepository;

@Service

public class ExpenseService {

    @Autowired
    ExpenceRepository expenseRepository;

    public void createExpense(Expense expense) {

        expenseRepository.save(expense);

    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getOneExpense(Long id) {

        Optional<Expense> optionalExpense = expenseRepository.findById(id);

        return optionalExpense.orElse(null);
    }

    public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public void obliterateExpense(Expense expense) {
        expenseRepository.delete(expense);
    }
}