package mediatheque.entity;
import javax.persistence.*;
import lombok.*;

@Entity @ToString(callSuper = true) @NoArgsConstructor
public class Livre extends Item {
    private String auteur;

    public Livre(Integer id, String titre, String auteur) {
        super(id, titre);
        this.auteur = auteur;
    }

}
