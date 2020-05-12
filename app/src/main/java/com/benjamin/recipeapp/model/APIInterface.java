package com.benjamin.recipeapp.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/recipes/{category}")
    Call<RecipeResult> listOfRecipes(
            @Path("category") String category,
            @Query("number") String number,
            @Query("apiKey") String apiKey
    );
}
