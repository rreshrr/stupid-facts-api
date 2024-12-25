package ru.thomaskohouse.StupidFactsApi.dto;

import lombok.Data;

import java.util.List;

@Data
public class DogFactDto {
    private String success;
    private List<String> facts;
}
