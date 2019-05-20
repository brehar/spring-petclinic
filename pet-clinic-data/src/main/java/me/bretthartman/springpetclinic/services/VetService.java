package me.bretthartman.springpetclinic.services;

import java.util.Set;
import me.bretthartman.springpetclinic.model.Vet;

public interface VetService {
  Vet findById(Long id);
  Vet save(Vet vet);
  Set<Vet> findAll();
}
