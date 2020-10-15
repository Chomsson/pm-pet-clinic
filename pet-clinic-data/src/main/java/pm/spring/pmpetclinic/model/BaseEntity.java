package pm.spring.pmpetclinic.model;
/* created by PM
  at 13.10.2020 */

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
