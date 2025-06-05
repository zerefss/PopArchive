package com.example.Pop_Archive.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Artist {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private int debutYear;
   @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
   @JsonManagedReference
   private List<PopSong> songs;

   public Artist() {
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getDebutYear() {
      return debutYear;
   }

   public void setDebutYear(int debutYear) {
      this.debutYear = debutYear;
   }

   public List<PopSong> getSongs() {
      return songs;
   }

   public void setSongs(List<PopSong> songs) {
      this.songs = songs;
   }

   @Override
   public String toString() {
      return "Artist{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", debutYear=" + debutYear +
            ", songs=" + songs +
            '}';
   }

   @Override
   public boolean equals(Object o) {
      if (!(o instanceof Artist artist)) return false;
      return debutYear == artist.debutYear && Objects.equals(id, artist.id) && Objects.equals(name, artist.name) && Objects.equals(songs, artist.songs);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, debutYear, songs);
   }
}
