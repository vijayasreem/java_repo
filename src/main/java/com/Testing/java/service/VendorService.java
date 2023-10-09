package com.Testing.java.service;

import com.Testing.java.model.Vendor;
import com.Testing.java.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    @Autowired
    public VendorService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public List<Vendor> getVendorsBySector(String sector) {
        return vendorRepository.findBySector(sector);
    }

    // Add other required business methods here

}