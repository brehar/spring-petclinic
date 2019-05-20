package me.bretthartman.springpetclinic.services;

import java.util.Set;
import me.bretthartman.springpetclinic.model.Pet;

public interface PetService {
  Pet findById(Long id);
  Pet save(Pet pet);
  Set<Pet> findAll();
}
