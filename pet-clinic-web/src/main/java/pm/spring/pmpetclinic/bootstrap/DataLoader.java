package pm.spring.pmpetclinic.bootstrap;
/* created by PM
  at 01.11.2020 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pm.spring.pmpetclinic.model.*;
import pm.spring.pmpetclinic.services.OwnerService;
import pm.spring.pmpetclinic.services.PetTypeService;
import pm.spring.pmpetclinic.services.SpecialitiesService;
import pm.spring.pmpetclinic.services.VetService;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {

        loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Zdzisław");
        owner1.setLastName("Kowalski");
        owner1.setAddress("Radomska 10");
        owner1.setCity("Warszawa");
        owner1.setTelephone("555 26 26");

        Pet zdzichuPet = new Pet();
        zdzichuPet.setPetType(savedDogType);
        zdzichuPet.setOwner(owner1);
        zdzichuPet.setBirthDate(LocalDate.now());
        zdzichuPet.setName("Azor");
        owner1.getPets().add(zdzichuPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mariola");
        owner2.setLastName("Nowak");
        owner2.setAddress("Jagielońska 25");
        owner2.setCity("Kraków");
        owner2.setTelephone("555 543 543");


        Pet mariolaPet = new Pet();
        mariolaPet.setPetType(savedCatType);
        mariolaPet.setOwner(owner2);
        mariolaPet.setBirthDate(LocalDate.now());
        mariolaPet.setName("Mruczek");
        owner2.getPets().add(mariolaPet);

        Pet mariolaPet2 = new Pet();
        mariolaPet2.setPetType(savedCatType);
        mariolaPet2.setOwner(owner2);
        mariolaPet2.setBirthDate(LocalDate.now());
        mariolaPet2.setName("Kicius");
        owner2.getPets().add(mariolaPet2);
        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Anna");
        vet1.setLastName("Mazurek");

        Vet vet2 = new Vet();
        vet2.setFirstName("Brunhilda");
        vet2.setLastName("Schwarz");

        Speciality radiology = new Speciality("Radiology");
        Speciality savedRadiology = specialitiesService.save(radiology);
        Speciality dentistry = new Speciality("Dentistry");
        Speciality savedDentistry = specialitiesService.save(dentistry);
        Speciality surgery = new Speciality("Surgery");
        Speciality savedSurgery = specialitiesService.save(surgery);


        vet1.getSpecialities().add(savedSurgery);
        vet1.getSpecialities().add(savedRadiology);

        vet2.getSpecialities().add(savedDentistry);

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets.....");
    }
}
