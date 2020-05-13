package com.benjamin.recipeapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.benjamin.recipeapp.R;
import com.benjamin.recipeapp.model.APIInterface;
import com.benjamin.recipeapp.model.RecipeResult;
import com.benjamin.recipeapp.model.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static String BASE_URL = "https://api.spoonacular.com";
    public static String API_KEY = "API_KEY";
    public static String CATEGORY = "random";
    public static int NUMBER = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface apiInterface = retrofit.create(APIInterface.class);

        Call<RecipeResult> call = apiInterface.listOfRecipes(CATEGORY, NUMBER, API_KEY);
        call.enqueue(new Callback<RecipeResult>() {
            @Override
            public void onResponse(Call<RecipeResult> call, Response<RecipeResult> response) {
                RecipeResult result = response.body();
                List<RecipeResult.RecipesBean> recipesBeans = result.getRecipes();

//                List<RecipeResult.RecipesBean> recipesBeans = new ArrayList<>();
                RecyclerAdapter adapter = new RecyclerAdapter(recipesBeans, MainActivity.this);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<RecipeResult> call, Throwable t) {

            }
        });
    }
}
