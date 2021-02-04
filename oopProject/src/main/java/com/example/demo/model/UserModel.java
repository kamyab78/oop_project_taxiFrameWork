package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
@Table(name = "my_user")
public class UserModel {
    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "userSeq")
    private Long id;
    private String username;
    private String pass;
    @Column(name = "name")
    private String name;
    private String family;

    public List<ReserveModel> getReserveModels() {
        return reserveModels;
    }

    public void setReserveModels(List<ReserveModel> reserveModels) {
        this.reserveModels = reserveModels;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "reserve_id")
    private List<ReserveModel> reserveModels;
    //




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }



}
