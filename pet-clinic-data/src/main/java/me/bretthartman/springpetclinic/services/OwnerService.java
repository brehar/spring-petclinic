package me.bretthartman.springpetclinic.services;

import java.util.Set;
import me.bretthartman.springpetclinic.model.Owner;

public interface OwnerService {
  Owner findByLastName(String lastName);
  Owner findById(Long id);
  Owner save(Owner owner);
  Set<Owner> findAll();
}
