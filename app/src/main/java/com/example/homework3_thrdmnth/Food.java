package com.example.homework3_thrdmnth;

public class Food {
    private String name;
    private  String desc;
    private String image;
    private String price;

    public Food(String name, String desc, String image, String price) {
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }

    public String getPrice() {
        return price ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice( String price) {
        this.price = price;
    }
}
