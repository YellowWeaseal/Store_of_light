package com.example.server.data.entity;

import com.example.server.data.dto.StreetLampDto;

import javax.persistence.*;

@Entity
public class StreetLamp { //Уличный светильник

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private String imgHref; //Путь к картинке

    @ManyToOne(optional = false)
    private Lamp lamp;

    public StreetLamp() {

    }

    public StreetLamp(StreetLampDto streetLampDto, Lamp lamp) {
        this.name = streetLampDto.getName();
        this.description = streetLampDto.getDescription();
        this.price = streetLampDto.getPrice();
        this.style = streetLampDto.getStyle();
        this.height = streetLampDto.getHeight();
        this.width = streetLampDto.getWidth();
        this.length = streetLampDto.getLength();
        this.color = streetLampDto.getColor();
        this.material = streetLampDto.getMaterial();
        this.lamp = lamp;
        this.imgHref = streetLampDto .getImgHref();
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

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public String getImgHref() {
        return imgHref;
    }

    public void setImgHref(String imgHref) {
        this.imgHref = imgHref;
    }
}
