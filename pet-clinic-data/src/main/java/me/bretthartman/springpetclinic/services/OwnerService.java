package me.bretthartman.springpetclinic.services;

import me.bretthartman.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}
