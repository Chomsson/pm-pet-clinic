package pm.spring.pmpetclinic.model;
/* created by PM
  at 10.11.2020 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

    public Speciality() {
    }

    public Speciality(String description){
        setDescription(description);
    }

    @Column(name = "description")
    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
