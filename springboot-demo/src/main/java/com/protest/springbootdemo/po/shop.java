package com.protest.springbootdemo.po;

public class shop {
    private String username;
    private String shoplist;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShoplist() {
        return shoplist;
    }

    public void setShoplist(String shoplist) {
        this.shoplist = shoplist;
    }

    @Override
    public String toString() {
        return "shop{" +
                "username='" + username + '\'' +
                ", shoplist='" + shoplist + '\'' +
                '}';
    }
}
