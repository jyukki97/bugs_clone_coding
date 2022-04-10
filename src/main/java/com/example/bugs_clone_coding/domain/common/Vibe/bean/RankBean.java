package com.example.bugs_clone_coding.domain.common.Vibe.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RankBean {
    int currentRank;
    boolean isNew;
    int rankVariation;

}
