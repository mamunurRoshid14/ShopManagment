package com.mamun.person;


/**
 *
 * @author MAMUNUR ROSHID
 */
public class Person {
    private String fullName;
    private String contactNumber;
    private String adress;
    private int age;

    public Person() {
        fullName = "Unknown";
        contactNumber = "Not Available";
        adress = "Unknown";
        age = 0;
    }
    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getAdress() {
        return adress;
    }
    public int getAge() {
        return age;
    }
}
