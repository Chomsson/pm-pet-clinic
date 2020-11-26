package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
