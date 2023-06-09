package com.gestock.stockfb.service;

import com.gestock.stockfb.model.Commande;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CommandeServiceTest {
    @Autowired
    private CommandeService commandeService;

    @Test
    void listeDesCommandesSouldReturnList() {
        List<Commande> resultatListCommandes = commandeService.listeDesCommandes();

        assertThat(resultatListCommandes).isNotNull();
        assertEquals(resultatListCommandes.get(0).getReference(), "CMD102023");
    }
}