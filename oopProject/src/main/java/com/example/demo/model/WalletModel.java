package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "wallet")
@Table
public class WalletModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "amount")
    private Long amount;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;

    public long getId() {
        return id;
    }

    public void setId(long idRow) {
        this.id = idRow;
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
