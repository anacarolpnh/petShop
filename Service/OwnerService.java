package com.petshop.Service;

import com.petshop.DTO.OwnerDtoRequest;
import com.petshop.DTO.OwnerDtoResponse;
import com.petshop.Domain.Owner;
import com.petshop.Repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService{
    private IOwnerRepository ownerRepository;

    @Autowired
    public OwnerService(IOwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public OwnerDtoResponse create(Owner owner) {
        OwnerDtoResponse ownerDto = OwnerDtoResponse.FromDomain(ownerRepository.save(owner));
        return ownerDto;
    }

    @Override
    public List<OwnerDtoResponse> getAll() {
        return OwnerDtoResponse.FromDomain(ownerRepository.findAll());
    }
}
