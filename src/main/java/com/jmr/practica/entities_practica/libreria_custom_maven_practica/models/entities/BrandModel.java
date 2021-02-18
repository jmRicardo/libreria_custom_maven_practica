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
@Table(name = "brand_model")
public class BrandModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_brand_model")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "id_brand")
    private Brand brand;

    private String model;
    private int strings;
    private String type;

}
