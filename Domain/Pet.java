package com.petshop.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String breed;

    @Column(nullable = false)
    String species;

    @Column(nullable = false)
    Integer age;

    @Column(nullable = false)
    String fur;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    Owner owner;

    public Pet() {
    }

    public Pet(String name, String breed, String species, Integer age, String fur, Owner owner) {
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
