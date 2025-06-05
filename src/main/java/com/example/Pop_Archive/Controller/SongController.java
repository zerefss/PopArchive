package com.example.Pop_Archive.Controller;

import com.example.Pop_Archive.DTO.SongDTO;
import com.example.Pop_Archive.Model.PopSong;
import com.example.Pop_Archive.Repository.PopSongRepository;
import com.example.Pop_Archive.Service.SongMapper;
import com.example.Pop_Archive.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/songs")
public class SongController {

   @Autowired
   @Qualifier("popSongRepository")
   private PopSongRepository songRepository;

   @Autowired
   private SongMapper mapper;

   @Autowired
   private SongService songService;

   @GetMapping
   public List<SongDTO> getAllSongs(){
      List<PopSong> songList = songRepository.findAll();
      return songList.stream().map(mapper::mapToDTO).collect(Collectors.toList());
   }

   @PostMapping
   public ResponseEntity<SongDTO> addSong(@RequestBody SongDTO songDTO){
      SongDTO savedSongs = mapper.mapToDTO(songService.createSong(songDTO));
      return ResponseEntity.status(HttpStatus.CREATED).body(savedSongs);
   }



}
