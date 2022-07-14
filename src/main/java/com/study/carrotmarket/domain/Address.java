package com.study.carrotmarket.domain;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Address {

    @Id @GeneratedValue
    @Column(name = "address_id")
    private Long id;

    @OneToMany(mappedBy = "member")
    private List<Member> members = new ArrayList<>();

    @OneToMany(mappedBy = "address")
    private List<Address> Addresses = new ArrayList<>();


    private String si;
    private String gu;
    private String dong;
}
