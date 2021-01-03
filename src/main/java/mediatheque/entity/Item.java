package mediatheque.entity;
import javax.persistence.*;
import lombok.*;

@ToString @NoArgsConstructor
@Entity
// Essayez les autres stratégies de mise en oeuvre de l'héritage
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// @Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {
    @Id
    private Integer id;
    private String titre;

    public Item(Integer id, String titre) {
        this.id = id;
        this.titre = titre;
    }

}
