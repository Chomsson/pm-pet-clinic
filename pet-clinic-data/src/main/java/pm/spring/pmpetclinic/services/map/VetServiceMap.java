package pm.spring.pmpetclinic.services.map;
/* created by PM
  at 20.10.2020 */

import org.springframework.stereotype.Service;
import pm.spring.pmpetclinic.model.Speciality;
import pm.spring.pmpetclinic.model.Vet;
import pm.spring.pmpetclinic.services.CrudService;
import pm.spring.pmpetclinic.services.SpecialitiesService;
import pm.spring.pmpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialitiesService;
    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
