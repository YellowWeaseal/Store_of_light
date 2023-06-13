package com.example.server.data.dto;

import com.example.server.data.entity.Lamp;

public class LampDto {

    private Long id;

    private String name; //Название

    private String description; //Описание

    private Double price; //Цена в рублях

    private String lampBase; //Цоколь лампы

    private String type; //Тип лампы (светодиодная, люминесцентная, накаливания итд)

    private Long power; //Мощность, Вт

    private Long voltage; //Напряжение, Вольт

    private String lightColor; //Описание света (холодный белый, теплый белый, разноцветный, синий итд)

    private String imgHref; //Путь к картинке

    public LampDto() {

    }

    public LampDto(Lamp lamp) {
        this.id = lamp.getId();
        this.name = lamp.getName();
        this.description = lamp.getDescription();
        this.price = lamp.getPrice();
        this.lampBase = lamp.getLampBase();
        this.type = lamp.getType();
        this.power = lamp.getPower();
        this.voltage = lamp.getVoltage();
        this.lightColor = lamp.getLightColor();
        this.imgHref = lamp.getImgHref();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLampBase() {
        return lampBase;
    }

    public void setLampBase(String lampBase) {
        this.lampBase = lampBase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Long getVoltage() {
        return voltage;
    }

    public void setVoltage(Long voltage) {
        this.voltage = voltage;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public String getImgHref() {
        return imgHref;
    }

    public void setImgHref(String imgHref) {
        this.imgHref = imgHref;
    }
}
