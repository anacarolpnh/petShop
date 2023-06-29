package com.petshop.Repository;

import com.petshop.Domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {

}
