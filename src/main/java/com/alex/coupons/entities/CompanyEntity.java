package com.alex.coupons.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")

public class CompanyEntity {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<UserEntity> users;
    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<CouponEntity> coupons;


    public CompanyEntity() {
    }

    public CompanyEntity(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public CompanyEntity(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public List<CouponEntity> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<CouponEntity> coupons) {
        this.coupons = coupons;
    }
}