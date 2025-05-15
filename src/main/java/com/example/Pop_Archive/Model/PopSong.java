package com.example.Pop_Archive.Model;


import java.util.Date;
import java.util.Objects;

public class PopSong {
   private int id;
   private String title;
   private String genre;
   private Date year;
   private int rating;

   public PopSong(int id, String title, String genre, Date year, int rating) {
      this.id = id;
      this.title = title;
      this.genre = genre;
      this.year = year;
      this.rating = rating;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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

   public Date getYear() {
      return year;
   }

   public void setYear(Date year) {
      this.year = year;
   }

   public int getRating() {
      return rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof PopSong popSong)) return false;
      return id == popSong.id && rating == popSong.rating && Objects.equals(title, popSong.title) && Objects.equals(genre, popSong.genre) && Objects.equals(year, popSong.year);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, title, genre, year, rating);
   }
}
