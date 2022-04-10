package com.example.bugs_clone_coding.domain.common.Vibe.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ChartBean {
    String chartDate;
    String chartTotalCount;
    String code;
    String date;
    String description;
    String duration;
    String id;
    String itemType;
    ChartItemsBean items;
    String snapshotId;
    String title;
    String type;
}
