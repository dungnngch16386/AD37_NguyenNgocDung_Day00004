package com.example.ad37_nguyenngocdung_day4;

public class ContactHistory {

    String number;
    String country;
    String date;
    String img;
    String name;

    public ContactHistory(String number, String country, String date, String img, String name) {
        this.number = number;
        this.country = country;
        this.date = date;
        this.img = img;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String isImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
