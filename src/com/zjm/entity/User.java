package com.zjm.entity;

public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String hobbies;
    private String phone;
    private String email;
    private String addrs;
    private String flag;

    public User(String username, String password, String sex, String[] hobbies, String phone, String email, String addrs) {
        this.username = username;
        this.password = password;
        this.sex = sex;
//        this.hobbies = hobbies;
        this.phone = phone;
        this.email = email;
        this.addrs = addrs;

        int i =0;
        for (String s:hobbies){
            if (i!=0){
                this.hobbies += ","+s;
            }else {
                this.hobbies = s;
            }
            i++;
        }
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", addrs='" + addrs + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
