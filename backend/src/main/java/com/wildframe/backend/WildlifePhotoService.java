package com.wildframe.backend;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WildlifePhotoService {

    private final WildlifePhotoRepository repository;

    public WildlifePhotoService(WildlifePhotoRepository repository) {
        this.repository = repository;
    }

    public List<WildlifePhotoResponse> getAllPhotos() {
        return repository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public WildlifePhoto addPhoto(WildlifePhoto photo) {
        return repository.save(photo);
    }

    public WildlifePhotoResponse getPhoto(Long id) {
        
        WildlifePhoto photo = repository.findById(id).orElseThrow();

        return toResponse(photo);
    }

    public void deletePhoto(Long id) {
        repository.deleteById(id);
    }

    public WildlifePhoto updatePhoto(Long id, WildlifePhoto updatedPhoto) {

        WildlifePhoto photo = repository.findById(id).orElseThrow();

        photo.setTitle(updatedPhoto.getTitle());
        photo.setDescription(updatedPhoto.getDescription());
        photo.setSpecies(updatedPhoto.getSpecies());
        photo.setLocation(updatedPhoto.getLocation());
        photo.setImageUrl(updatedPhoto.getImageUrl());
        photo.setDateTaken(updatedPhoto.getDateTaken());

        return repository.save(photo);
    }

    public WildlifePhotoResponse addPhoto(WildlifePhotoRequest request) {

        WildlifePhoto photo = new WildlifePhoto();

        photo.setTitle(request.getTitle());
        photo.setDescription(request.getDescription());
        photo.setSpecies(request.getSpecies());
        photo.setLocation(request.getLocation());
        photo.setImageUrl(request.getImageUrl());
        photo.setDateTaken(request.getDateTaken());

        WildlifePhoto savedPhoto = repository.save(photo);  

        return toResponse(savedPhoto);
    }

    private WildlifePhotoResponse toResponse(WildlifePhoto photo) {

        return new WildlifePhotoResponse(
                photo.getId(),
                photo.getTitle(),
                photo.getDescription(),
                photo.getSpecies(),
                photo.getLocation(),
                photo.getImageUrl(),
                photo.getDateTaken()
        );
    }
}
