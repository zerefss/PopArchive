package com.example.Pop_Archive.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

   @GetMapping("/artist")
   public String ListArtist(){
      return "Yorushika";
   }
}
