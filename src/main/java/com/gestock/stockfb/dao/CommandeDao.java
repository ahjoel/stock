package com.gestock.stockfb.dao;

import com.gestock.stockfb.database.DatabaseStock;
import com.gestock.stockfb.model.Commande;
import com.gestock.stockfb.model.Fourniture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandeDao {

    public List<Commande> getAll(){
        //DatabaseStock.getInstanceCommande().stream().forEach(System.out::println);
        return DatabaseStock.getInstanceCommande();
    }

    public Fourniture getById(int index){
        return DatabaseStock.getInstance().get(index);
    }

    public List<Commande> save(Commande commande){
        var commandes = DatabaseStock.getInstanceCommande();
        commandes.add(commande);
        return commandes;
    }

    public List<Commande> delete(Commande commande){
        var commandes = DatabaseStock.getInstanceCommande();
        commandes.remove(commande);
        return commandes;
    }
}
