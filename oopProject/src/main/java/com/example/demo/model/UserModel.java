package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user", schema = "ReservDB")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "pass")
    private String pass;
    @Column(name = "name")
    private String name;
    @Column(name = "family")
    private String family;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "reserve_id")
    private List<ReserveModel> reserveModels;


    @OneToOne
    @JoinColumn(name = "id")
    private PaymentModel paymentModel;


    @OneToOne
    @JoinColumn(name = "id")
    private WalletModel wallet;

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }


    public WalletModel getWallet() {
        return wallet;
    }

    public void setWallet(WalletModel wallet) {
        this.wallet = wallet;
    }

    public List<ReserveModel> getReserveModels() {
        return reserveModels;
    }

    public void setReserveModels(List<ReserveModel> reserveModels) {
        this.reserveModels = reserveModels;
    }

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
