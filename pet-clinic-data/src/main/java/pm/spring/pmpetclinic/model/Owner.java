package pm.spring.pmpetclinic.model;
/* created by PM
  at 26.09.2020 */

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }



}
