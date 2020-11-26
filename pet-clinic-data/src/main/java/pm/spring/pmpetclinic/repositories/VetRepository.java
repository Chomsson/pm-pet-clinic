package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
