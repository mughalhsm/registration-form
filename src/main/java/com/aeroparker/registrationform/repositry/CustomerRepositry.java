package com.aeroparker.registrationform.repositry;

import com.aeroparker.registrationform.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<CustomerDetails, Integer> {
}
