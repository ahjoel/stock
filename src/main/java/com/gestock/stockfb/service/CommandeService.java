package com.gestock.stockfb.service;

import com.gestock.stockfb.dao.CommandeDao;
import com.gestock.stockfb.dao.FournitureDao;
import com.gestock.stockfb.model.Commande;
import com.gestock.stockfb.model.Fourniture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeService {
    private final CommandeDao commandeDao;

    public List<Commande> listeDesCommandes(){
        return commandeDao.getAll();
    }

}
