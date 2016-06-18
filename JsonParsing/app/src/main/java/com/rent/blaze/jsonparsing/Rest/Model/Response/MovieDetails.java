package com.rent.blaze.jsonparsing.Rest.Model.Response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blaze on 6/16/16.
 */
public class MovieDetails {

    private String budget;
    private Boolean adult;
    private String backdrop_path;
    private String belongs_to_path;
    private String homepage;
    private Integer id;
    private String original_language;
    private String original_title;
    private String overview;
    private Float popularity;
    private String poster_path;
    private String date;
    private String revenue;
    private String runtime;
    private String status;
    private String taglne;
    private String title;
    private Boolean video;
    private String vote_average;
    private Integer vote_Count;

    @SerializedName("production_companies")
    private ArrayList<ProductionCompanies> productionCompanies = new ArrayList<ProductionCompanies>();

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getBelongs_to_path() {
        return belongs_to_path;
    }

    public void setBelongs_to_path(String belongs_to_path) {
        this.belongs_to_path = belongs_to_path;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaglne() {
        return taglne;
    }

    public void setTaglne(String taglne) {
        this.taglne = taglne;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public Integer getVote_Count() {
        return vote_Count;
    }

    public void setVote_Count(Integer vote_Count) {
        this.vote_Count = vote_Count;
    }

    public ArrayList<ProductionCompanies> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(ArrayList<ProductionCompanies> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public ArrayList<ProductionCountries> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(ArrayList<ProductionCountries> productionCountries) {
        this.productionCountries = productionCountries;
    }

    private ArrayList<ProductionCountries> productionCountries = new ArrayList<ProductionCountries>();


}
