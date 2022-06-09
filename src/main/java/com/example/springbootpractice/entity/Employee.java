package com.example.springbootpractice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "employees")
public class Employee {
    @Id
    private String id;
    private String name;
    private double wage;
}
