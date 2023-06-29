package com.petshop.Service;

import com.petshop.DTO.OwnerDtoRequest;
import com.petshop.DTO.OwnerDtoResponse;
import com.petshop.Domain.Owner;

import java.util.List;

public interface IOwnerService {
    OwnerDtoResponse create(Owner owner);
    List<OwnerDtoResponse> getAll();
}
