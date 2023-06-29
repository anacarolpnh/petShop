package com.petshop.Controller;

import com.petshop.DTO.OwnerDtoRequest;
import com.petshop.DTO.OwnerDtoResponse;
import com.petshop.Service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    private final IOwnerService ownerService;

    @Autowired
    public OwnerController(IOwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping
    public OwnerDtoResponse createOwner(@RequestBody OwnerDtoRequest ownerDto) {
        return ownerService.create(ownerDto.ToDomain());
    }

    @GetMapping()
    public List<OwnerDtoResponse> getAll() {
        return ownerService.getAll();
    }
}
