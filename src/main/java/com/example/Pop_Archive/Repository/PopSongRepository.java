package com.example.Pop_Archive.Repository;

import com.example.Pop_Archive.Model.PopSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("popSongRepository")
public interface PopSongRepository extends JpaRepository<PopSong,Long>{
//   Optional<PopSong> findByName(String name);
}

