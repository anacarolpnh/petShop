package com.petshop.Service;

import com.petshop.DTO.PetDtoRequest;
import com.petshop.DTO.PetDtoResponse;
import com.petshop.Domain.Pet;

import java.util.List;

public interface IPetService {
    PetDtoResponse create(PetDtoRequest petRequest);
    List<PetDtoResponse> getAll();
}