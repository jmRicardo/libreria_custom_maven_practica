package com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "string_set")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_set")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "id_brand_model")
    private BrandModel brandModel;

    private int stock;

}
