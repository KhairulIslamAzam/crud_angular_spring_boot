package com.bs23.repository.jpa;

import com.bs23.repository.schema.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Khairul Islam Azam
 * @created 23/08/2021 - 6:11 PM
 * @project IntelliJ IDEA
 */
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

//    List<Expense> findAll();
}
