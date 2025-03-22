package com.SpingbootBank.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUSTOMER")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    private String custName;

    private String custAddress;

    @Column(unique = true)
    private Long custContactNumber;

    @Column(unique = true)
    private String custEmailId;

    private String custPassword;

    private Double custAccountBlance;

    @JsonFormat(pattern ="dd-MM-yyyy")
    private Date custDOB;

    private String custGender;


}
