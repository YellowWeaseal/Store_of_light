package com.example.server.data.dto;

import com.example.server.data.entity.Chandelier;

public class ChandelierDto{

    private Long id;

    private String name; //Название

    private String description; //Описание

    private Double price; //Цена в рублях

    private String brandName; //Имя бренда

    private String style; //Описание стиля/дизайна

    private Double height; //Высота в см

    private Double length; //Длина в см

    private Double width; //Ширина в см

    private String imgHref; //Путь к картинке

    public ChandelierDto() {

    }

    public ChandelierDto(Chandelier chandelier) {
        this.id = chandelier.getId();
        this.name = chandelier.getName();
        this.description = chandelier.getDescription();
        this.price = chandelier.getPrice();
        this.brandName = chandelier.getBrandName();
        this.style = chandelier.getStyle();
        this.height = chandelier.getHeight();
        this.length = chandelier.getLength();
        this.width = chandelier.getWidth();
        this.imgHref = chandelier.getImgHref();
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public String getImgHref() {
        return imgHref;
    }

    public void setImgHref(String imgHref) {
        this.imgHref = imgHref;
    }
}
