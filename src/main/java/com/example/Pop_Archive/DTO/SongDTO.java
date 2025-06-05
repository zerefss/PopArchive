package com.example.Pop_Archive.DTO;

public class SongDTO {
   private String title;
   private String genre;
   private String artistName;
   private int artistDebutYear;

   public SongDTO() {
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

   public String getArtistName() {
      return artistName;
   }

   public void setArtistName(String artistName) {
      this.artistName = artistName;
   }

   public int getArtistDebutYear() {
      return artistDebutYear;
   }

   public void setArtistDebutYear(int artistDebutYear) {
      this.artistDebutYear = artistDebutYear;
   }
}
