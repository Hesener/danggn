package com.study.carrotmarket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    private String title;

    private String content;

    private LocalDate createdDate;
    private LocalDate updatedDate;

    @Enumerated(EnumType.STRING)
    private SellingStatus status;
}
