package com.stream.app.payloads;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CustomMessage {

    private String message;
    private boolean success=false;

}