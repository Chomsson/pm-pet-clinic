package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
