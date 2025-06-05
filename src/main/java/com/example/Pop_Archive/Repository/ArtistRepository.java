package com.example.Pop_Archive.Repository;

import com.example.Pop_Archive.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository("artistRepository")
public interface ArtistRepository extends JpaRepository<Artist,Long> {
   Optional<Artist> findByName(String name);
}
