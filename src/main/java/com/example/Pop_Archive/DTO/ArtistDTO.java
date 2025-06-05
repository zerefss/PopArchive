package com.example.Pop_Archive.DTO;

import com.example.Pop_Archive.Model.PopSong;

import java.util.List;

public class ArtistDTO {

   private String artistName;
   private String artistDebutYear;
   private List<PopSong> songList;

   public ArtistDTO(String artistName, String artistDebutYear, List<PopSong> songList) {
      this.artistName = artistName;
      this.artistDebutYear = artistDebutYear;
      this.songList = songList;
   }

   public String getArtistName() {
      return artistName;
   }

   public void setArtistName(String artistName) {
      this.artistName = artistName;
   }

   public String getArtistDebutYear() {
      return artistDebutYear;
   }

   public void setArtistDebutYear(String artistDebutYear) {
      this.artistDebutYear = artistDebutYear;
   }

   public List<PopSong> getSongList() {
      return songList;
   }

   public void setSongList(List<PopSong> songList) {
      this.songList = songList;
   }





}
