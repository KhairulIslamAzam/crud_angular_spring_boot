package com.bs23.service;

import com.bs23.repository.jpa.ExpenseRepository;
import com.bs23.repository.schema.Expense;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Khairul Islam Azam
 * @created 23/08/2021 - 6:16 PM
 * @project IntelliJ IDEA
 */
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public List<Expense> getAllExpense(){

        return expenseRepository.findAll();
    }
}
