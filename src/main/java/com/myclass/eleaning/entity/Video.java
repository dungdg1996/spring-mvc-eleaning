package com.myclass.eleaning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private Integer video;
    private String title;
    private String url;
    private String image;
    private int timeCount;
    private int courseId;
}
