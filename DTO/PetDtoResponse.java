package com.petshop.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.petshop.Domain.Owner;
import com.petshop.Domain.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetDtoResponse {

    @JsonProperty
    Long id;

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
    Owner owner;

    public PetDtoResponse() {
    }

    public PetDtoResponse(Long id, String name, String breed, String species, Integer age, String fur, Owner owner) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.species = species;
        this.age = age;
        this.fur = fur;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public static PetDtoResponse FromDomain(Pet pet){
        return new PetDtoResponse(pet.getId(), pet.getName(), pet.getBreed(), pet.getSpecies(), pet.getAge(), pet.getFur(), pet.getOwner());
    }

    public static List<PetDtoResponse> FromDomain(List<Pet> pets) {
        List<PetDtoResponse> petsDto = new ArrayList<>();

        for (int i = 0; i < pets.stream().count(); i++) {
            petsDto.add(FromDomain(pets.get(i)));
        }
        return petsDto;
    }
}
