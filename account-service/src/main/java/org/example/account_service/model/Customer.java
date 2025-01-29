package org.example.account_service.model;

public class Customer {
    private Long id;
    private  String firstName;
    private  String lastName;
    private  String email;

    public Customer(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
