package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "driver")
@Table
public class DriverModel {
    @Id
    private Long id;
    private String username;
    private String pass;
    @Column(name = "name")
    private String name;
    private String family;
private String carinfo;
private String sex;

    public String getCarinfo() {
        return carinfo;
    }

    public void setCarinfo(String carinfo) {
        this.carinfo = carinfo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<ReserveModel> getReserveModels() {
        return reserveModels;
    }

    public void setReserveModels(List<ReserveModel> reserveModels) {
        this.reserveModels = reserveModels;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "reserve_id")
    private List<ReserveModel> reserveModels;

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    //
    @OneToOne
    @JoinColumn(name = "id")
    private PaymentModel paymentModel;




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
