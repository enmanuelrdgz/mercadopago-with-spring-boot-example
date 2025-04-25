package com.marcomnrq.ecommerce.domain.model;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Payment extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String parameters;
    private String body;
}
