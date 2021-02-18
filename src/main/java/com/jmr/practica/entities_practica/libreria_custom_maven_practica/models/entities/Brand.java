package com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_brand")
    private long id;

    private String name;
    private String country;

    @OneToMany(mappedBy = "brand",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private List<BrandModel> listBrandModel;

}
