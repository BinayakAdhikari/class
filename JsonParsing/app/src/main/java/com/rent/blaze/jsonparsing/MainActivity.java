package com.rent.blaze.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rent.blaze.jsonparsing.Rest.Model.Response.MovieDetails;
import com.rent.blaze.jsonparsing.Rest.Model.Response.ProductionCompanies;
import com.rent.blaze.jsonparsing.Rest.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RetrofitManager retrofitManager = null;

        //registering retrofit for network calls
        retrofitManager = RetrofitManager.getInstance();
        retrofitManager.getMoviesInfo("550", "9ee4b67c5f201aa49b4344bcd6d83ef3", new Callback<MovieDetails>() {
            @Override
            public void onResponse(Call<MovieDetails> call, Response<MovieDetails> response) {
                Log.i("Sucess", "onResponse: ");
                if (response.code() == 200) {

                    MovieDetails movieDetails = response.body();
                    Log.i("Sucess", "onResponse: " + movieDetails.getOriginal_title());
                    Log.i("Sucess", "onResponse: " + movieDetails.getAdult());

                    for (ProductionCompanies productionCompanies:movieDetails.getProductionCompanies()){
                        Log.i("Sucess", "onResponse: " + productionCompanies.getName());
                    }

                }


            }

            @Override
            public void onFailure(Call<MovieDetails> call, Throwable t) {
                Log.i("Failure", "onFailure: ");

            }
        });
    }
}
