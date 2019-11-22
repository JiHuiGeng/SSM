package com.ssm.manager.pojo;

/**
 * @program: ssm-parent
 * @description:
 * @author: Mr.Geng
 * @create: 2019-11-21 21:07
 **/
public class User {
    public int user_ID;
    public String user_Name;
    public String user_Password;
    public int user_Age;
    public String user_Address;

    public User() {
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public int getUser_Age() {
        return user_Age;
    }

    public void setUser_Age(int user_Age) {
        this.user_Age = user_Age;
    }

    public String getUser_Address() {
        return user_Address;
    }

    public void setUser_Address(String user_Address) {
        this.user_Address = user_Address;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_ID=" + user_ID +
                ", user_Name='" + user_Name + '\'' +
                ", user_Password='" + user_Password + '\'' +
                ", user_Age=" + user_Age +
                ", user_Address='" + user_Address + '\'' +
                '}';
    }
}
