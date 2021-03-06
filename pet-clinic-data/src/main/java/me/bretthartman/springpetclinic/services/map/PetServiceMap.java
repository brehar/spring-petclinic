package me.bretthartman.springpetclinic.services.map;

import java.util.Set;
import me.bretthartman.springpetclinic.model.Pet;
import me.bretthartman.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet pet) {
    return super.save(pet.getId(), pet);
  }

  @Override
  public void delete(Pet pet) {
    super.delete(pet);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
