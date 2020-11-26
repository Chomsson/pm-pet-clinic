package pm.spring.pmpetclinic.services.springdatajpa;
/* created by PM
  at 26.11.2020 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pm.spring.pmpetclinic.model.Vet;
import pm.spring.pmpetclinic.repositories.SpecialityRepository;
import pm.spring.pmpetclinic.repositories.VetRepository;
import pm.spring.pmpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;


    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;

    }


    @Override
    public Set<Vet> findAll() {

        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
