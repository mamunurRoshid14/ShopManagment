package com.mamun.shop.product;
import com.mamun.shop.gui.ui.newproductadd.NewProductAdd;
import java.io.Serializable;

/**
 *
 * @author MAMUNUR ROSHID
 */
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String productName;
    private int productId;
    private String productCatagory;
    private String productSubCatagory;
    private String modelNumber;
    private int buyingPrice;
    private int sellPrice;
    private double discount;
    private String brand;
    private int availableUnit;

    public Product() {
        productName = "Unknown";
        productId = 0;
        productCatagory = "Unknown";
        productSubCatagory = "Unknown";
        modelNumber = "Unknown";
        buyingPrice = 0;
        sellPrice = 0;
        discount = 0.0;
        brand = "Unkhown";
        availableUnit = 0;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }
    public void setProductSubCatagory(String productSubCatagory) {
        this.productSubCatagory = productSubCatagory;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setAvailableUnit(int availableUnit) {
        this.availableUnit = availableUnit;
    }
    
    public  String getProductName() {
        return productName;
    }
    public int getProductId() {
        return productId;
    }
    public String getProductCatagory() {
        return productCatagory;
    }
    public String getProductSubCatagory() {
        return productSubCatagory;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public int getBuyingPrice() {
        return buyingPrice;
    }
    public int getSellPrice() {
        return sellPrice;
    }
    public double getDiscount() {
        return discount;
    }
    public String getBrand() {
        return brand;
    }
    public int getAvailableUnit() {
        return availableUnit;
    }
}
