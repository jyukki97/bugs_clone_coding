package com.example.bugs_clone_coding.domain.common.Vibe.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class AlbumBean {
    String agencyName;
    String albumGenres;
    String albumId;
    String albumTitle;
    String artistTotalCount;
    List<ArtistBean> artists = new ArrayList<>();
    String imageUrl;
    Boolean isAdult;
    Boolean isAlbumAODD;
    Boolean isDolbyAtmos;
    Boolean isHqs;
    Boolean isMusicianLeague;
    Boolean isPlug;
    Boolean isRegular;
    String productionName;
    String releaseDate;
    String shareUrl;
    String urlScheme;
    String artistLinkUrl;
}
