package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {


    @JsonProperty("calories")
    private int calories;
    @JsonProperty("carbohydrates")
    private int carbohydrates;
    @JsonProperty("fat")
    private int fat;
    @JsonProperty("protein")
    private int protein;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein)  {
        this.protein = protein;
    }
}

