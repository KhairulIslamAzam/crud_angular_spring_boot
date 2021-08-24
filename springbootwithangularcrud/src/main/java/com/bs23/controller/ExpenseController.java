package com.bs23.controller;

import com.bs23.repository.schema.Expense;
import com.bs23.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Khairul Islam Azam
 * @created 24/08/2021 - 9:03 AM
 * @project IntelliJ IDEA
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ExpenseController {

    private final ExpenseService expenseService;

    @GetMapping("/")
    public ResponseEntity<List<Expense>> getAllExpense(){

        List<Expense> expenses = expenseService.getAllExpense();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }
}
