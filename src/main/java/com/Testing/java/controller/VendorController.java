package com.Testing.java.controller;

import com.Testing.java.model.Vendor;
import com.Testing.java.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/{sector}")
    public List<Vendor> getVendorsBySector(@PathVariable String sector) {
        return vendorService.getVendorsBySector(sector);
    }

    // Add other required business methods here

}