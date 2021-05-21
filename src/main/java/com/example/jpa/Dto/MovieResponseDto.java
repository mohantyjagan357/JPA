package com.example.jpa.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponseDto {


    int id;
    private String name;
    private int ratings;

    public MovieResponseDto(int id, String name, int ratings) {
        this.id = id;
        this.name = name;
        this.ratings = ratings;
    }
}
