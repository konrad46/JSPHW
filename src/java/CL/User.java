/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CL;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;



 public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String userName;
    private String password;
    private String saltedAndHashedPassword;
    private String salt;
   
          
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
        userName = lastName + zipCode;
        password = "welcome1";
        saltedAndHashedPassword = "";
        salt = "";
             
             
              
    }
    public User( String firstName, String lastName, String phone,
                  String address,String city,String state,String zipCode,String email){
          this.firstName = firstName;
          this.lastName = lastName;
          this.phone = phone;
          this.address = address;
          this.city = city;
          this.state = state;
          this.zipCode = zipCode;
          this.email = email;
          this.userName = lastName + zipCode;
          this.password = "welcome1";
          this.salt = PasswordUtil.getSalt();
        try {
            this.saltedAndHashedPassword = PasswordUtil.hashPassword(this.password + this.salt);                   
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        } 
          }
    public String getPassword(){
              return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setlastname(String lastName){
        this.lastName = lastName;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getZipCode(){
        return zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSaltedAndHashedPassword () {
        return saltedAndHashedPassword;
    }
    
    public String getSalt () {
        return salt;
    }

 }