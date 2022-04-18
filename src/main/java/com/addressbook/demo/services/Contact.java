package com.addressbook.demo.services;

public class Contact {
    private String id;
    private String name;
    private String phone;
    
    public String getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
}
