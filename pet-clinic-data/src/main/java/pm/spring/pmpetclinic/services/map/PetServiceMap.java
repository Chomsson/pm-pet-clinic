package pm.spring.pmpetclinic.services.map;
/* created by PM
  at 20.10.2020 */

import pm.spring.pmpetclinic.model.Pet;
import pm.spring.pmpetclinic.services.CrudService;
import pm.spring.pmpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
