package pm.spring.pmpetclinic.model;
/* created by PM
  at 10.11.2020 */

import javax.persistence.Entity;

//@Entity
//@Table(name = "specialties")
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
