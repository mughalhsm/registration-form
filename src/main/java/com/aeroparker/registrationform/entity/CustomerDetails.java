package com.aeroparker.registrationform.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @Column(nullable = false)
    private Date registered;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    @Column(name = "email_address", length = 255, nullable = false, unique = true)
    private String email;

    @PrePersist
    public void prepareForSave() {
        this.registered = new Date();
        this.email = this.email.toLowerCase();
        // include any other tasks that need to be performed before saving the entity
    }

    @NotBlank(message = "Title is mandatory")
    @Size(max = 5, message = "Title should have maximum 5 characters")
    @Column(length = 5, nullable = false)
    private String title;

    @NotBlank(message = "First Name is mandatory")
    @Size(max = 50, message = "First Name should have maximum 50 characters")
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotBlank(message = "Last Name is mandatory")
    @Size(max = 50, message = "Last Name should have maximum 50 characters")
    @Column(name = "last_name", length = 50)
    private String lastName;


    @NotBlank(message = "Address Line 1 is mandatory")
    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Size(max = 255, message = "City should have maximum 255 characters")
    private String city;

    @NotBlank(message = "Postcode is mandatory")
    @Size(max = 10, message = "Postcode should have maximum 10 characters")
    @Column(length = 10)
    private String postcode;


    @Size(max = 20, message = "Phone Number should have maximum 20 characters")
    @Column(name = "phone_number", length = 20)
    private String phone;

}
