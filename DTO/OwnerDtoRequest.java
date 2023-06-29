package com.petshop.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.petshop.Domain.Owner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OwnerDtoRequest {

    @JsonProperty
    String name;

    @JsonProperty
    String address;

    @JsonProperty
    String document;

    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate birthday;

    public OwnerDtoRequest() {
    }

    public OwnerDtoRequest(String name, String address, String document, LocalDate birthday) {
        this.name = name;
        this.address = address;
        this.document = document;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Owner ToDomain(){
        return new Owner(this.name, this.address, this.document, this.birthday);
    }

    public static OwnerDtoRequest FromDomain(Owner owner){
        return new OwnerDtoRequest(owner.getName(), owner.getAddress(), owner.getDocument(), owner.getBirthday());
    }

    public static List<OwnerDtoRequest> FromDomain(List<Owner> owners){
        List<OwnerDtoRequest> ownersDto= new ArrayList<>();

        for (int i = 0; i < owners.stream().count(); i++){
            ownersDto.add(FromDomain(owners.get(i)));
        }
        return ownersDto;
    }
}