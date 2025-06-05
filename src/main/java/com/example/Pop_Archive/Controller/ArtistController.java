package com.example.Pop_Archive.Controller;


import com.example.Pop_Archive.Model.Artist;
import com.example.Pop_Archive.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

   @Autowired
   @Qualifier("artistRepository")
   private ArtistRepository artistRepostory;

   @GetMapping("/getArtists")
   public List<Artist> getArtist(){
      return artistRepostory.findAll();
   }

   @PostMapping
   public Artist addArtist(@RequestBody Artist artist){
      return artistRepostory.save(artist);
   }
}
