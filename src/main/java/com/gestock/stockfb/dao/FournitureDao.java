package com.gestock.stockfb.dao;

import com.gestock.stockfb.database.DatabaseStock;
import com.gestock.stockfb.model.Fourniture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FournitureDao {

    public List<Fourniture> getAll(){
        //DatabaseStock.getInstance().stream().forEach(System.out::println);
        return DatabaseStock.getInstance();
    }

    public Fourniture getById(int index){
        return DatabaseStock.getInstance().get(index);
    }

    public List<Fourniture> save(Fourniture fourniture){
        var fournitures = DatabaseStock.getInstance();
        fournitures.add(fourniture);
        return fournitures;
    }

    public List<Fourniture> delete(Fourniture fourniture){
        var fournitures = DatabaseStock.getInstance();
        fournitures.remove(fourniture);
        return fournitures;
    }
}
