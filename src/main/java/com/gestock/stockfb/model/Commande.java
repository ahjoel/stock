package com.gestock.stockfb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Commande {
    public String reference;
    public int qteFourniture;
    public String status;
    public String date;
}
