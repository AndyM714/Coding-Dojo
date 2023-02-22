package com.andy.safetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andy.safetravels.models.Expense;
import com.andy.safetravels.services.ExpenseService;

@Controller
public class MainController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public String index(@ModelAttribute("expense") Expense expense, Model model) {
        List<Expense> expenses = expenseService.getAllExpenses();
        System.out.print(expenses);
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    @PostMapping("/expenses")
    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {

        if (result.hasErrors()) {

            return "index.jsp";
        } else {

            expenseService.createExpense(expense);
        }
        return "redirect:/";
    }

    @GetMapping("/expenses/{id}")

    public String show(@PathVariable("id") Long id, Model model) {

        Expense expense = expenseService.getOneExpense(id);
        model.addAttribute("expense", expense);
        return "show.jsp";
    }

    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {

        Expense expense = expenseService.getOneExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }

    @PutMapping("/expenses/{id}")
    public String update(@ModelAttribute("expense") Expense expense) {
        expenseService.updateExpense(expense);
        return "redirect:/";
    }

    @DeleteMapping("/expenses/{id}")
    public String obliterate(@PathVariable("id") Long id) {

        Expense expense = expenseService.getOneExpense(id);
        expenseService.obliterateExpense(expense);

        return "redirect:/";
    }
}