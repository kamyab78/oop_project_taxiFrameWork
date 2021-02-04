package com.example.demo.model;


import javax.persistence.*;

@Entity(name = "reserve")
@Table
public class ReserveModel {
    @Id
    @SequenceGenerator(name = "filmSeq", sequenceName = "film_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "filmSeq")
    private Long id;
    private String city;
    private Long cost;
    private String distanse;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;
}
