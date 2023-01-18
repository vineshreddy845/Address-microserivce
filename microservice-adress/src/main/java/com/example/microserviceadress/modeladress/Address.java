package com.example.microserviceadress.modeladress;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="adress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="country")
    private String country;
    @Column(name="villagename")
    private String villagename;
    @Column(name="mandal")
    private String mandal;
}
