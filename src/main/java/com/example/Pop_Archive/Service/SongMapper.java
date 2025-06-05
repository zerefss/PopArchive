package com.example.Pop_Archive.Service;

import com.example.Pop_Archive.DTO.SongDTO;
import com.example.Pop_Archive.Model.Artist;
import com.example.Pop_Archive.Model.PopSong;
import org.springframework.stereotype.Component;

@Component
public class SongMapper {
   public SongDTO mapToDTO(PopSong song){
      SongDTO dto = new SongDTO();
      dto.setTitle(song.getTitle());
      dto.setGenre(song.getGenre());
      dto.setArtistName(song.getArtist().getName());
      dto.setArtistDebutYear(song.getArtist().getDebutYear());
      return dto;
   }

   public PopSong mapToEntity(SongDTO dto, Artist artist) {
      PopSong song = new PopSong();
      song.setTitle(dto.getTitle());
      song.setGenre(dto.getGenre());
      song.setArtist(artist);
      return song;
   }



}
