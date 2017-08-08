package com.example.admin.myapplication;

/**
 * Created by Admin on 02-08-2017.
 */

public class Dataprovider {
    private int img_res;
    private String m_name,amount,offer;
    private int image1,image2,image3,image4;

    public Dataprovider(int img_res,int image1, int image2, int image3, int image4, String m_name, String amount,  String offer) {
        this.img_res = img_res;
        this.m_name = m_name;
        this.amount = amount;
        this.offer = offer;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public int getImage4() {
        return image4;
    }

    public void setImage4(int image4) {
        this.image4 = image4;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }


}
