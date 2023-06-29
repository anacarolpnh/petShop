package com.petshop.Service;

import com.petshop.DTO.PetDtoRequest;
import com.petshop.DTO.PetDtoResponse;
import com.petshop.Domain.Owner;
import com.petshop.Domain.Pet;
import com.petshop.Repository.IOwnerRepository;
import com.petshop.Repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService implements IPetService {

    private final IPetRepository petRepository;
    private final IOwnerRepository ownerRepository;

    @Autowired
    public PetService(IPetRepository petRepository, IOwnerRepository ownerRepository) {
        this.petRepository = petRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public PetDtoResponse create(PetDtoRequest pet) {
        Owner owner = ownerRepository.findById(pet.getOwnerId()).orElse(new Owner());

        return PetDtoResponse.FromDomain(this.petRepository.save(pet.ToDomain(owner)));
    }

    @Override
    public List<PetDtoResponse> getAll() {
        return PetDtoResponse.FromDomain(this.petRepository.findAll());
    }
}
