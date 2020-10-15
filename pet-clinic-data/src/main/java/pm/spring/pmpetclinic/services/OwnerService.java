package pm.spring.pmpetclinic.services;

import pm.spring.pmpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
