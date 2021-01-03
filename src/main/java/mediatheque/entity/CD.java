package mediatheque.entity;
import javax.persistence.*;
import lombok.*;

@ToString(callSuper = true) @NoArgsConstructor
@Entity 
public class CD extends Item {
     private String interprete;
     public CD(Integer id, String titre, String interprete) {
        super(id, titre);
        this.interprete = interprete;
    }
}
