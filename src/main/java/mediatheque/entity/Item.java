package mediatheque.entity;
import javax.persistence.*;
import lombok.*;

@ToString @NoArgsConstructor
@Entity 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item {
    @Id
    private Integer id;
    private String titre;

    public Item(Integer id, String titre) {
        this.id = id;
        this.titre = titre;
    }

}
