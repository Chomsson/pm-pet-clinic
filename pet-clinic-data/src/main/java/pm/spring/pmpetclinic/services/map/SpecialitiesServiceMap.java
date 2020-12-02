package pm.spring.pmpetclinic.services.map;
/* created by PM
  at 12.11.2020 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pm.spring.pmpetclinic.model.Speciality;
import pm.spring.pmpetclinic.services.SpecialitiesService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
