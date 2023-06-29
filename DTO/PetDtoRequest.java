package com.petshop.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.petshop.Domain.Owner;
import com.petshop.Domain.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetDtoRequest {

    @JsonProperty
    String name;

    @JsonProperty
    String breed;

    @JsonProperty
    String species;

    @JsonProperty
    Integer age;

    @JsonProperty
    String fur;

    @JsonProperty()
    Long ownerId;

    public PetDtoRequest() {
    }

    public PetDtoRequest(String name, String breed, String species, Integer age, String fur) {
        this.name = name;
        this.breed = breed;
        this.species = species;
        this.age = age;
        this.fur = fur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Pet ToDomain(Owner owner){
        return new Pet(this.name, this.breed, this.species, this.age, this.fur, owner);
    };

    public static PetDtoRequest FromDomain(Pet pet){
        return new PetDtoRequest(pet.getName(), pet.getBreed(), pet.getSpecies(), pet.getAge(), pet.getFur());
    }

    public static List<PetDtoRequest> FromDomain(List<Pet> pets) {
        List<PetDtoRequest> petsDto = new ArrayList<>();

        for (int i = 0; i < pets.stream().count(); i++) {
            petsDto.add(FromDomain(pets.get(i)));
        }
        return petsDto;
    }
}
