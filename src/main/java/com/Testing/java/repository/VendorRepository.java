
package com.Testing.java.repository;

import com.Testing.java.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

    @Query("SELECT v FROM Vendor v WHERE v.sector = ?1")
    List<Vendor> findBySector(String sector);

    // Add other required methods here

}
