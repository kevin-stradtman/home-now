package com.stradtkt.homenow.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address1;
    private String address2;
    private String city;
    private Character state;
    private String zipCode;
    private String price;
    private Integer beds;
    private Double baths;
    private Integer garages;
    private Double lotSize;
    private Double sqft;
    private Double description;
    private Boolean isHotDeal;
    private Blob photoMain;
    private Blob photo2;
    private Blob photo3;
    private Blob photo4;
    private Blob photo5;
    private Blob photo6;
    private Blob photo7;
    private Blob photo8;
    private Blob photo9;

    public Home() {
    }

    public Home(String address1, String address2, String city, Character state,
                String zipCode, String price, Integer beds, Double baths, Integer garages,
                Double lotSize, Double sqft, Double description, Boolean isHotDeal, Blob photoMain, Blob photo2,
                Blob photo3, Blob photo4, Blob photo5, Blob photo6, Blob photo7, Blob photo8, Blob photo9) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.garages = garages;
        this.lotSize = lotSize;
        this.sqft = sqft;
        this.description = description;
        this.isHotDeal = isHotDeal;
        this.photoMain = photoMain;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.photo6 = photo6;
        this.photo7 = photo7;
        this.photo8 = photo8;
        this.photo9 = photo9;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getBaths() {
        return baths;
    }

    public void setBaths(Double baths) {
        this.baths = baths;
    }

    public Integer getGarages() {
        return garages;
    }

    public void setGarages(Integer garages) {
        this.garages = garages;
    }

    public Double getLotSize() {
        return lotSize;
    }

    public void setLotSize(Double lotSize) {
        this.lotSize = lotSize;
    }

    public Double getSqft() {
        return sqft;
    }

    public void setSqft(Double sqft) {
        this.sqft = sqft;
    }

    public Double getDescription() {
        return description;
    }

    public void setDescription(Double description) {
        this.description = description;
    }

    public Boolean getHotDeal() {
        return isHotDeal;
    }

    public void setHotDeal(Boolean hotDeal) {
        isHotDeal = hotDeal;
    }

    public Blob getPhotoMain() {
        return photoMain;
    }

    public void setPhotoMain(Blob photoMain) {
        this.photoMain = photoMain;
    }

    public Blob getPhoto2() {
        return photo2;
    }

    public void setPhoto2(Blob photo2) {
        this.photo2 = photo2;
    }

    public Blob getPhoto3() {
        return photo3;
    }

    public void setPhoto3(Blob photo3) {
        this.photo3 = photo3;
    }

    public Blob getPhoto4() {
        return photo4;
    }

    public void setPhoto4(Blob photo4) {
        this.photo4 = photo4;
    }

    public Blob getPhoto5() {
        return photo5;
    }

    public void setPhoto5(Blob photo5) {
        this.photo5 = photo5;
    }

    public Blob getPhoto6() {
        return photo6;
    }

    public void setPhoto6(Blob photo6) {
        this.photo6 = photo6;
    }

    public Blob getPhoto7() {
        return photo7;
    }

    public void setPhoto7(Blob photo7) {
        this.photo7 = photo7;
    }

    public Blob getPhoto8() {
        return photo8;
    }

    public void setPhoto8(Blob photo8) {
        this.photo8 = photo8;
    }

    public Blob getPhoto9() {
        return photo9;
    }

    public void setPhoto9(Blob photo9) {
        this.photo9 = photo9;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zipCode='" + zipCode + '\'' +
                ", price='" + price + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", garages=" + garages +
                ", lotSize=" + lotSize +
                ", sqft=" + sqft +
                ", description=" + description +
                ", isHotDeal=" + isHotDeal +
                ", photoMain=" + photoMain +
                ", photo2=" + photo2 +
                ", photo3=" + photo3 +
                ", photo4=" + photo4 +
                ", photo5=" + photo5 +
                ", photo6=" + photo6 +
                ", photo7=" + photo7 +
                ", photo8=" + photo8 +
                ", photo9=" + photo9 +
                '}';
    }
}
