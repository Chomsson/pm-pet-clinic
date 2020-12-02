package pm.spring.pmpetclinic.services.map;
/* created by PM
  at 10.11.2020 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pm.spring.pmpetclinic.model.PetType;
import pm.spring.pmpetclinic.services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
