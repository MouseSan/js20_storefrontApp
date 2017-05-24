package ru.tsystems.js20.storefrontApp;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import ru.tsystems.js20.storefrontApp.service.Brand;

@JsonIgnoreProperties({ "categoryDto", "description" })
public class Product {

    private Long id;
    private String name;
    private Double price;
    private Double weight;
    private Double volume;
    private Double stock;
    private Brand brandDto;
    private boolean backlight;
    private String clockFace;
    private String glass;
    private String gender;
    private String waterResistant;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Brand getBrandDto() {
        return brandDto;
    }

    public void setBrandDto(Brand brandDto) {
        this.brandDto = brandDto;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public String getClockFace() {
        return clockFace;
    }

    public void setClockFace(String clockFace) {
        this.clockFace = clockFace;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(String waterResistant) {
        this.waterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", volume=" + volume +
                ", stock=" + stock +
                ", brandDto=" + brandDto +
                ", backlight=" + backlight +
                ", clockFace='" + clockFace + '\'' +
                ", glass='" + glass + '\'' +
                ", gender='" + gender + '\'' +
                ", waterResistant='" + waterResistant + '\'' +
                '}';
    }
}
