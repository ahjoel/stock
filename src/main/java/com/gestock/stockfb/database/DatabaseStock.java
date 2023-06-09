package com.gestock.stockfb.database;

import com.gestock.stockfb.model.Commande;
import com.gestock.stockfb.model.Fourniture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class DatabaseStock {
    private static List<Fourniture> fournitures;
    private static List<Commande> commandes;

    //Singleton : Constructeur private
    private DatabaseStock(){
        this.fournitures = getListFournitureFromDatabase();
    }

    public static List<Fourniture> getInstance() {
        if (!Optional.ofNullable(fournitures).isPresent()){
            fournitures = getListFournitureFromDatabase();
        }
        return fournitures;
    }

    public static List<Commande> getInstanceCommande() {
        if (!Optional.ofNullable(commandes).isPresent()){
            commandes = getListCommandeFromDatabase();
        }
        return commandes;
    }

    public static List<Fourniture> getListFournitureFromDatabase(){
        var fourniture1 = Fourniture.builder().nom("Agrafes").lot("Boîte").quantiteSeuil(5).categorie("Bureau").dateCreation("05-05-2023").build();
        var fourniture2 = Fourniture.builder().nom("Agrafeuse").lot("Unité").quantiteSeuil(10).categorie("Bureau").dateCreation("07-05-2023").build();
        var fourniture3 = Fourniture.builder().nom("Bloc note").lot("Emballage").quantiteSeuil(5).categorie("Administrative").dateCreation("08-05-2023").build();
        var fourniture4 = Fourniture.builder().nom("Cartouche Noir").lot("Boîte").quantiteSeuil(5).categorie("Consommable").dateCreation("09-05-2023").build();
        var fourniture5 = Fourniture.builder().nom("Classeur").lot("Unité").quantiteSeuil(20).categorie("Gestion de papier").dateCreation("10-05-2023").build();
        var fourniture6 = Fourniture.builder().nom("Intercalaire").lot("Emballage").quantiteSeuil(5).categorie("Gestion de papier").dateCreation("12-05-2023").build();
        var fourniture7 = Fourniture.builder().nom("Perforateur").lot("Unité").quantiteSeuil(5).categorie("Bureau").dateCreation("14-05-2023").build();
        var fourniture8 = Fourniture.builder().nom("Ramette").lot("Carton").quantiteSeuil(20).categorie("Papeterie").dateCreation("16-05-2023").build();
        var fourniture9 = Fourniture.builder().nom("Agrafes").lot("Boîte").quantiteSeuil(10).categorie("Bureau").dateCreation("20-05-2023").build();

        List<Fourniture> fournitures = new ArrayList();
        fournitures.add(fourniture1);
        fournitures.add(fourniture2);
        fournitures.add(fourniture3);
        fournitures.add(fourniture4);
        fournitures.add(fourniture5);
        fournitures.add(fourniture6);
        fournitures.add(fourniture7);
        fournitures.add(fourniture8);
        fournitures.add(fourniture9);

        return fournitures;
    }

    public static List<Commande> getListCommandeFromDatabase(){
        var commande1 = Commande.builder().reference("CMD102023").qteFourniture(4).status("En cours").date("05-05-2023").build();
        var commande2 = Commande.builder().reference("CMD112023").qteFourniture(5).status("En cours").date("05-05-2023").build();
        var commande3 = Commande.builder().reference("CMD122023").qteFourniture(3).status("En cours").date("06-04-2023").build();
        var commande4 = Commande.builder().reference("CMD132023").qteFourniture(11).status("Livrée").date("12-03-2023").build();
        var commande5 = Commande.builder().reference("CMD142023").qteFourniture(7).status("En cours").date("15-04-2023").build();
        var commande6 = Commande.builder().reference("CMD152023").qteFourniture(9).status("En cours").date("01-06-2023").build();
        var commande7 = Commande.builder().reference("CMD162023").qteFourniture(2).status("En cours").date("28-05-2023").build();
        var commande8 = Commande.builder().reference("CMD172023").qteFourniture(12).status("En cours").date("30-05-2023").build();
        var commande9 = Commande.builder().reference("CMD182023").qteFourniture(6).status("En cours").date("11-02-2023").build();


        List<Commande> commandes = new ArrayList();
        commandes.add(commande1);
        commandes.add(commande2);
        commandes.add(commande3);
        commandes.add(commande4);
        commandes.add(commande5);
        commandes.add(commande6);
        commandes.add(commande7);
        commandes.add(commande8);
        commandes.add(commande9);


        return commandes;
    }
}
