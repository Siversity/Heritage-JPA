package mediatheque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import lombok.extern.log4j.Log4j2;

import mediatheque.entity.*;
import mediatheque.dao.*;

@Component
@Log4j2 // Génère le 'logger' pour afficher les messages de trace
public class ConsoleApp implements CommandLineRunner {

    @Autowired
    private ItemRepository itemDAO;

    @Override
    /**
     * Equivalent de la méthode 'main' pour une application Spring Boot
     **/
    public void run(String... args) throws Exception {
        
        tapezEnterPourContinuer();    

        log.info("Démo de l'héritage en Spring-JPA");
        // On crée des entités dans les sous-classes de 'Item'
        Item cd = new CD(1, "Dark Side of the Moon", "Pink Floyd");
        Item livre = new Livre(2, "Lord of the Rings", "Tolkien");
        // On les enregistre dans la base
        itemDAO.save(cd);
        itemDAO.save(livre);
        // On les retrouve dans les Item
        itemDAO.findAll().forEach(System.out::println);
        
    }

    public static void tapezEnterPourContinuer() throws Exception {
        System.out.println("Tapez \"ENTER\" pour continuer...");
        System.in.read();
    }
}
