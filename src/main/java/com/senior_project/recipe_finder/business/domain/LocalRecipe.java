package com.senior_project.recipe_finder.business.domain;

import lombok.Data;
import org.apache.tomcat.jni.Local;

import java.util.List;

@Data
public class LocalRecipe implements Comparable<LocalRecipe>{
    private String label;
    private String image;
    private String url;
    private Integer yield;
    private List<String> ingredientLines;
    private Integer totalTime;
    private Integer matchedIngredients = 0;

    public void increaseUnmatchedIngredientsByOne(){
        matchedIngredients += 1;
    }

    @Override
    public int compareTo(LocalRecipe otherRecipe){
        return otherRecipe.matchedIngredients - this.matchedIngredients;
    }
}
