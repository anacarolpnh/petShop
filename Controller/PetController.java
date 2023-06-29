package com.petshop.Controller;

import com.petshop.DTO.PetDtoRequest;
import com.petshop.DTO.PetDtoResponse;
import com.petshop.Service.IOwnerService;
import com.petshop.Service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final IPetService petService;
    private final IOwnerService ownerService;

    @Autowired
    public PetController(IPetService petService, IOwnerService ownerService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }

    @PostMapping
    public PetDtoResponse createPet(@RequestBody PetDtoRequest petDto) {
        return petService.create(petDto);
    }

    @GetMapping()
    public List<PetDtoResponse> getAll() {
        return petService.getAll();
    }
}
