package com.dut.education.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;


public class UserRole implements GrantedAuthority {

    private int id;
    private String name;

    /*private List<UserFromDB> userList;*/

    @Override
    public String getAuthority() {
        return getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<UserFromDB> getUserList() {
        return userList;
    }

    public void setUserList(List<UserFromDB> userList) {
        this.userList = userList;
    }
*/
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
