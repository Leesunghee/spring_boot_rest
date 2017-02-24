package com.ready2die.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by leesunghee on 2017. 2. 12..
 */

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    @NotNull
    @Size(min = 3, max = 30)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

}
