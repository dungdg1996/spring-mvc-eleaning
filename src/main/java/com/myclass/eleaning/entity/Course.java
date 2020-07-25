package com.myclass.eleaning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer id;
    private String title;
    private int lecturesCount;
    private int hourCount;

    private int categoryId;
    private int price;
    private double discount;
    private String description;
    private String image;
    private String content;


}
