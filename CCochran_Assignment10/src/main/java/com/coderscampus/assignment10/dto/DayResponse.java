package com.coderscampus.assignment10.dto;

import java.util.List;

public class DayResponse {

    private List meals;
    private Nutrients nutrients;


    public List getMeals() {
        return meals;
    }

    public void setMeals(List meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
