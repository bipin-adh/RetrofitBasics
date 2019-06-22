package com.example.retrofitbasics;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Structure the api call according to the response.
 * i.e.
 * URL is giving us an JSON ARRAY and this is nothing but a list of heroes.
 * So we defined the Call type as a List and List type as hero.
 */
public interface Api {

    String BASE_URL =   "https://simplifiedcoding.net/demos/";

    /**
     * defining an HTTP get request. it will make a complete URL joining base url and api name "marvel"
     */
    @GET("marvel")
    Call<List<Hero>> getHeroes();

    /**
     * we have a method named getHeroes() with return type Call.
     * type of Call is List<>.
     * and type of List is Hero.
     *
     */
}
