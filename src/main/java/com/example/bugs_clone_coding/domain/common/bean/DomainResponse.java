package com.example.bugs_clone_coding.domain.common.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DomainResponse {
    private HeaderBean header;

    public DomainResponse() {
        this.header = HeaderBean.createSuccess();
    }
}
