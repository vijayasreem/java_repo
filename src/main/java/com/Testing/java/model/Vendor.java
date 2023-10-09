package com.Testing.java.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sector")
    private String sector;

    // Add other fields and their getters/setters here

    public Vendor() {
    }

    public Vendor(String name, String sector) {
        this.name = name;
        this.sector = sector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    // Add other getters/setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendor vendor = (Vendor) o;
        return Objects.equals(id, vendor.id) &&
                Objects.equals(name, vendor.name) &&
                Objects.equals(sector, vendor.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sector);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}