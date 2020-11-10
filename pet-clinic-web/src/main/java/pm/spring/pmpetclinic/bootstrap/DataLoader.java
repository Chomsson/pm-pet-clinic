package pm.spring.pmpetclinic.bootstrap;
/* created by PM
  at 01.11.2020 */

import pm.spring.pmpetclinic.model.Owner;
import pm.spring.pmpetclinic.model.PetType;
import pm.spring.pmpetclinic.model.Vet;
import pm.spring.pmpetclinic.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pm.spring.pmpetclinic.services.PetTypeService;
import pm.spring.pmpetclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Zdzisław");
        owner1.setLastName("Kowalski");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Euzebiusz");
        owner2.setLastName("Nowak");
        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Anna");
        vet1.setLastName("Mazurek");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Brunhilda");
        vet2.setLastName("Schwarz");
        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
