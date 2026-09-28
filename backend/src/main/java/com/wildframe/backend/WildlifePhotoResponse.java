package com.wildframe.backend;

public class WildlifePhotoResponse {

    private Long id;
    private String title;
    private String description;
    private String species;
    private String location;
    private String imageUrl;
    private String dateTaken;

    public WildlifePhotoResponse(
            Long id,
            String title,
            String description,
            String species,
            String location,
            String imageUrl,
            String dateTaken) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.species = species;
        this.location = location;
        this.imageUrl = imageUrl;
        this.dateTaken = dateTaken;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDateTaken() {
        return dateTaken;
    }
}
