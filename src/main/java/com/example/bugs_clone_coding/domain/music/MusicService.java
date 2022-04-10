package com.example.bugs_clone_coding.domain.music;

import com.example.bugs_clone_coding.domain.common.Vibe.bean.VibeBean;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.scheduler.Schedulers;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class MusicService {
    private final WebClient webClient;


    public VibeBean getChart() {
        return webClient.get()
                .uri(URI.create("https://apis.naver.com/vibeWeb/musicapiweb/vibe/v1/chart/track/total?display=300"))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(VibeBean.class)
                .publishOn(Schedulers.boundedElastic())
                .block();
    }
}
