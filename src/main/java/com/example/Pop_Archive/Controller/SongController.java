package com.example.Pop_Archive.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

   @GetMapping("/song")
   public String listSongs(){
      return ("Song List");
   }

//   @PostMapping("/songs")
//   public PopSong saveSong(int id, String title, String artist, Date year, int rating){
//   }
}
