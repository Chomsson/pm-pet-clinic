package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
