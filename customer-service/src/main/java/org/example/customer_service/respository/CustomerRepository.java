package org.example.customer_service.respository;

import org.example.customer_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource: cette annotation est provenante par spring data rest qui presente les methodes post get put delete pour les customers sans avoir deja les ecrire


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
