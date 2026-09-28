package com.wildframe.backend;
import jakarta.validation.constraints.NotBlank;
public class WildlifePhotoRequest {

    private String title;
    private String description;
    private String species;
    private String location;
    private String imageUrl;
    private String dateTaken;

    @NotBlank
    public String getTitle() {
        return title;
    }

    @NotBlank
    public String getDescription() {
        return description;
    }

    @NotBlank
    public String getSpecies() {
        return species;
    }

    @NotBlank
    public String getLocation() {
        return location;
    }

    @NotBlank
    public String getImageUrl() {
        return imageUrl;
    }

    @NotBlank
    public String getDateTaken() {
        return dateTaken;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
    }
}
