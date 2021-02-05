package com.example.demo.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="reserve", schema = "public")
public class ReserveModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "cost")
    private Long cost;
    @Column(name = "distanse")
    private String distanse;
    @Column(name = "start_time")
    private Long start_time;
    @Column(name = "delay")
    private int delay;

    public Long getStart_time() {
        return start_time;
    }

    public void setStart_time(Long start_time) {
        this.start_time = start_time;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public DriverModel getDriverModel() {
        return driverModel;
    }

    public void setDriverModel(DriverModel driverModel) {
        this.driverModel = driverModel;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private DriverModel driverModel ;


    @OneToOne
    @JoinColumn(name = "type_trip")
    private TypeTripModel typeTripModel;


    public TypeTripModel getTypeTripModel() {
        return typeTripModel;
    }
    @OneToOne
    @JoinColumn(name = "id")
    private PaymentModel paymentModel;

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public void setTypeTripModel(TypeTripModel typeTripModel) {
        this.typeTripModel = typeTripModel;
    }







    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getDistanse() {
        return distanse;
    }

    public void setDistanse(String distanse) {
        this.distanse = distanse;
    }




}
