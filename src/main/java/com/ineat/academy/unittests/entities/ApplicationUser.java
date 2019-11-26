package com.ineat.academy.unittests.entities;

import javax.persistence.*;

@Entity
@Table(name = "application_user")
public class ApplicationUser {
    @Column(name = "id")
    @Id
    public String id;
    @Column(name = "first_name")
    @Basic
    public String firstName;
    @Column(name = "last_name")
    @Basic
    public String lastName;
    @Column(name = "email")
    @Basic
    public String email;
    @Column(name = "code_rayon")
    @Basic
    public Integer codeRayon;
    @Column(name = "magasin_number")
    @Basic
    public Integer magasinNumber;
    @Column(name = "accepte_cgu")
    @Basic
    public Boolean accepteCGU;
}
