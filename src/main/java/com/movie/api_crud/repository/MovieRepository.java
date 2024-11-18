package com.movie.api_crud.repository;

import com.movie.api_crud.model.*;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
