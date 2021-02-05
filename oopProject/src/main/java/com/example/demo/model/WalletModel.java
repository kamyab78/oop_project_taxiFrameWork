package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "wallet")
@Table
public class WalletModel {
    @Id
    private Long id;
    private Long amount;

    public Long getId() {
        return id;
    }

    public void setId(Long idRow) {
        this.id = idRow;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
}
