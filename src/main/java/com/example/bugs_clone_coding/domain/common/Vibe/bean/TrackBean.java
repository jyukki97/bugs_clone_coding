package com.example.bugs_clone_coding.domain.common.Vibe.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class TrackBean {
    AlbumBean album;
    int artistTotalCount;
    List<ArtistBean> artists = new ArrayList<>();
    int discNumber;
    String gdid;
    boolean hasLyric;
    boolean hasSyncLyric;
    boolean hasVideo;
    boolean isAdult;
    boolean isAodd;
    boolean isDRM;
    boolean isDolbyAtmos;
    boolean isDownload;
    boolean isGift;
    boolean isHqs;
    boolean isKaraokeEnabled;
    boolean isMobileDownload;
    boolean isMusicianLeague;
    boolean isPlug;
    boolean isPrdd;
    boolean isRecordShareEnabled;
    boolean isSearchFree;
    boolean isStreaming;
    boolean isTaggable;
    boolean isTopPopular;
    int likeCount;
    RankBean rank;
    int currentRank;
    boolean isNew;
    int rankVariation;
    boolean represent;
    int representDownloadPrice;
    String shareUrl;
    int trackId;
    int trackNumber;
    String trackTitle;
    int videoId;
}
