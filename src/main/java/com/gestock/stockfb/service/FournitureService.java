package com.gestock.stockfb.service;

import com.gestock.stockfb.dao.FournitureDao;
import com.gestock.stockfb.model.Fourniture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FournitureService {
    private final FournitureDao fournitureDao;

    public List<Fourniture> listeDesFournitures(){
        return fournitureDao.getAll();
    }

}
