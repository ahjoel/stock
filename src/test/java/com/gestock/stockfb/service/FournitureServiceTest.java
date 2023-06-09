package com.gestock.stockfb.service;

import com.gestock.stockfb.dao.FournitureDao;
import com.gestock.stockfb.model.Fourniture;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FournitureServiceTest {

    //Injection de dependance
    @Autowired
    private FournitureDao fournitureDao;

    // Ce qu'on veut tester - la couche service sera injecter
    // au lieu de creer une instance
    @Autowired
    private FournitureService fournitureService;

    @Test
    void listeDesFournituresShouldReturnList() {

        //When - en utilisant le Dao quand il prend tel fonction il doit retourner ceci
        List<Fourniture> resultatListFournitures = fournitureService.listeDesFournitures();

        //Then - test du resultat
        assertThat(resultatListFournitures).isNotNull();
        assertEquals(resultatListFournitures.get(0).getNom(), "Agrafes");
    }
}