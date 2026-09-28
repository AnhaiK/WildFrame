package com.wildframe.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WildlifePhotoRepository
        extends JpaRepository<WildlifePhoto, Long> {
}
