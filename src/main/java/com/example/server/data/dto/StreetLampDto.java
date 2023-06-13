package com.example.server.data.dto;

import com.example.server.data.entity.StreetLamp;

public class StreetLampDto {

    private Long id;

    private String name; //Название

    private String description; //Описание

    private Double price; //Цена в рублях

    private String style; //Стиль (дизайн) светильника

    private Double height; //Высота в см

    private Double length; //Длина в см

    private Double width; //Ширина в см

    private String color; //Цвет светильника (не света)

    private String material; //Материалы светильнкиа

    private Long lampId;

    private String imgHref; //Путь к картинке

    public StreetLampDto() {

    }

    public StreetLampDto(StreetLamp streetLamp) {
        this.id = streetLamp.getId();
        this.name = streetLamp.getName();
        this.description = streetLamp.getDescription();
        this.price = streetLamp.getPrice();
        this.style = streetLamp.getStyle();
        this.height = streetLamp.getHeight();
        this.width = streetLamp.getWidth();
        this.length = streetLamp.getLength();
        this.color = streetLamp.getColor();
        this.material = streetLamp.getMaterial();
        this.lampId = streetLamp.getLamp().getId();
        this.imgHref = streetLamp.getImgHref();
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getLampId() {
        return lampId;
    }

    public void setLampId(Long lampId) {
        this.lampId = lampId;
    }

    public String getImgHref() {
        return imgHref;
    }

    public void setImgHref(String imgHref) {
        this.imgHref = imgHref;
    }
}
