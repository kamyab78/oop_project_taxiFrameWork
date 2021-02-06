package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "wallet", schema = "", catalog = "")
public class WalletModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "amount")
    private Long amount;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }


}
