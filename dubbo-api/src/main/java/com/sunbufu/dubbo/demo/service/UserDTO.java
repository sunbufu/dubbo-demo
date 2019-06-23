package com.sunbufu.dubbo.demo.service;

import java.io.Serializable;
import java.util.Objects;

public class UserDTO implements Serializable {

    private String userName;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(userName, userDTO.userName) &&
                Objects.equals(sex, userDTO.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, sex);
    }
}
