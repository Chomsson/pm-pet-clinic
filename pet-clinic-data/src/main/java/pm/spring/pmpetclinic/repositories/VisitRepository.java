package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit , Long> {
}
