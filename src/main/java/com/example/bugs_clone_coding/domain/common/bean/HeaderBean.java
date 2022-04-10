package com.example.bugs_clone_coding.domain.common.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HeaderBean {
    private Boolean isSuccessful;
    private int resultCode;
    private String resultMessage;

    public static HeaderBean createSuccess() {
        return new HeaderBean().setIsSuccessful(true)
                .setResultCode(200)
                .setResultMessage("success");
    }
}
