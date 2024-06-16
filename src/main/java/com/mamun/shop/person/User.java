
package com.mamun.shop.person;

import com.mamun.person.Person;
/**
 *
 * @author MAMUNUR ROSHID
 */
public class User extends Person {
    private String userName;
    private String userPassword;
    private String roleAs;
    public User(){
        userName = "Unknown";
        userPassword = "Unknown";
        roleAs = "Not Set Yet";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setRoleAs(String roleAs) {
        this.roleAs = roleAs;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public String getRole(){
        return roleAs;
    }
}
