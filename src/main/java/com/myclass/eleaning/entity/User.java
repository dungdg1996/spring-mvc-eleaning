package com.myclass.eleaning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String fullname;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String avatar;
    int roleId;
}
