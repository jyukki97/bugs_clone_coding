package com.example.bugs_clone_coding.domain.music;

import com.example.bugs_clone_coding.domain.common.Vibe.bean.VibeBean;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/bugs/v1.0/music")
public class MusicController {
    private final MusicService musicService;

    @GetMapping()
    public VibeBean music() {
        return musicService.getChart();
    }
}
