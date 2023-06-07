package com.gestock.stockfb.database;

import com.gestock.stockfb.model.Fourniture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class DatabaseStock {
    private static List<Fourniture> fournitures;

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
}
