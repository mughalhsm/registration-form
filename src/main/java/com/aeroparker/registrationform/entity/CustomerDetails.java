package com.aeroparker.registrationform.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "customers")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registered;
    @PrePersist
    public void setRegistrationDate() {
        this.registered = new Date();
    }

    @Column(name = "email_address", unique = true, length = 255)
    private String email;
    @Column(length = 5)
    private String title;

    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;
    private String city;
    @Column(length = 10)
    private String postcode;

    @Column(name = "phone_number", length = 20)
    private String phone;

}
