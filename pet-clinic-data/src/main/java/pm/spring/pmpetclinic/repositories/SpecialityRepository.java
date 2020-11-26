package pm.spring.pmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pm.spring.pmpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
