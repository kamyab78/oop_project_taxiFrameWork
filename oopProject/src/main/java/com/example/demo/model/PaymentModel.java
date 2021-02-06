package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="payment", schema = "")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cost")
    private Long cost;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
    @OneToOne
    @JoinColumn(name = "reserve_id")
    private ReserveModel reserveModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long amount) {
        this.cost = amount;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public ReserveModel getReserveModel() {
        return reserveModel;
    }

    public void setReserveModel(ReserveModel reserveModel) {
        this.reserveModel = reserveModel;
    }
}
