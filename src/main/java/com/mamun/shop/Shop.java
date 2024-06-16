package com.mamun.shop;

import com.mamun.person.Person;

public class Shop {
    public String shopName;
    public Person onwer;
    public String contactNumber;
    public String shopAdress;
    public int totalSaleAmount;
    public int totalInterest;
    public Shop(){
        shopName = "Unknown";
        onwer=new Person();
        contactNumber="Unlnown";
        shopAdress="Unkhown";
        totalSaleAmount=0;
        totalInterest=0;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
    public void setOnwer(Person onwer) {
        this.onwer = onwer;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void setShopAdress(String shopAdress) {
        this.shopAdress = shopAdress;
    }
    
    public void addToTotalSaleAmount(int amount){
        totalSaleAmount+=amount;
    }
    
    public void addToTotalInterest(int amount){
        totalInterest+=amount;
    }
    
    public String getShopName(){
        return shopName;
    }

    public Person getOnwer() {
        return onwer;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getShopAdress() {
        return shopAdress;
    }

    public int getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public int getTotalInterest() {
        return totalInterest;
    }
}
