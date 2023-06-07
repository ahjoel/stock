package com.gestock.stockfb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Fourniture {
    private String nom;
    private String lot;
    private int quantiteSeuil;
    private String dateCreation;
    private String categorie;

}
