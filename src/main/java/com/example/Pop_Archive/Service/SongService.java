package com.example.Pop_Archive.Service;

import com.example.Pop_Archive.DTO.SongDTO;
import com.example.Pop_Archive.Model.Artist;
import com.example.Pop_Archive.Model.PopSong;
import com.example.Pop_Archive.Repository.ArtistRepository;
import com.example.Pop_Archive.Repository.PopSongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SongService {
   @Autowired
   @Qualifier("popSongRepository")
   private PopSongRepository popSongRepository;

   @Autowired
   @Qualifier("artistRepository")
   private ArtistRepository artistRepository;

   @Autowired
   private SongMapper mapper;

   public PopSong createSong (SongDTO dto){
      Optional<Artist> artistOpt = artistRepository.findByName(dto.getArtistName());


      Artist artist;
      if(artistOpt.isPresent()){
         artist = artistOpt.get();
      } else {
         artist = new Artist();
         artist.setName(dto.getArtistName());
         artist.setDebutYear(dto.getArtistDebutYear());
      }

      PopSong song = mapper.mapToEntity(dto,artist);

      return popSongRepository.save(song);
   }
}
