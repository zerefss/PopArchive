package com.example.Pop_Archive.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class PopSong {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY )
   private Long id;

   private String title;
   private String genre;
   @ManyToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "artist_id")
   @JsonBackReference
   private Artist artist;

   public Long getId() {
      return id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public Artist getArtist() {
      return artist;
   }

   public void setArtist(Artist artist) {
      this.artist = artist;
   }

}
