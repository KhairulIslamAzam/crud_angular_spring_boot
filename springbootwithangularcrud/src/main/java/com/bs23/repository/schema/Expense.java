package com.bs23.repository.schema;

import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Khairul Islam Azam
 * @created 22/08/2021 - 8:24 PM
 * @project IntelliJ IDEA
 */
@Getter
@Setter
@Entity
@Accessors(chain = true)
@Table(name = SchemaConstant.EXPENSE_TABLE_NAME)
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expense;

    private String descriptions;

    private BigDecimal amount;

}
