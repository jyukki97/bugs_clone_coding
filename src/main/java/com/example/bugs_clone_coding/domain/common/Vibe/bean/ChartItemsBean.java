package com.example.bugs_clone_coding.domain.common.Vibe.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class ChartItemsBean {
    int trackTotalCount;
    List<TrackBean> tracks = new ArrayList<>();
}
