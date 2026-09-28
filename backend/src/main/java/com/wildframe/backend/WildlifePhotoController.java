package com.wildframe.backend;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/photos")
public class WildlifePhotoController {

    private final WildlifePhotoService service;

    public WildlifePhotoController(WildlifePhotoService service) {
        this.service = service;
    }

    @GetMapping
    public List<WildlifePhotoResponse> getAllPhotos() {
        return service.getAllPhotos();
    }

    @PostMapping
    public WildlifePhotoResponse addPhoto(@Valid @RequestBody WildlifePhotoRequest request) {
        return service.addPhoto(request);
    }

    @GetMapping("/{id}")
    public WildlifePhotoResponse getPhoto(@PathVariable Long id) {
        return service.getPhoto(id);
    }

    @DeleteMapping("/{id}")
    public void deletePhoto(@PathVariable Long id) {
        service.deletePhoto(id);
    }

    @PutMapping("/{id}")
    public WildlifePhoto updatePhoto(
            @PathVariable Long id,
            @RequestBody WildlifePhoto photo) {

        return service.updatePhoto(id, photo);
    }
}

