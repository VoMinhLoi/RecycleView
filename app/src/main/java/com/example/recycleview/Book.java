package com.example.recycleview;

public class Book {
    private int resourceID;
    private String tenAnh;

    public Book(int resourceID, String tenAnh) {
        this.resourceID = resourceID;
        this.tenAnh = tenAnh;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getTenAnh() {
        return tenAnh;
    }

    public void setTenAnh(String tenAnh) {
        this.tenAnh = tenAnh;
    }
}
