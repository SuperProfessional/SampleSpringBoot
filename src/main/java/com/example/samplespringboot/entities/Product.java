package com.example.samplespringboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private java.lang.Long id;

    @Column(name = "Name")
    @Nationalized
    private java.lang.String name;

    @Column(name = "Price")
    private java.math.BigDecimal price;

    @Column(name = "Quantity")
    private Integer quantity;

}
