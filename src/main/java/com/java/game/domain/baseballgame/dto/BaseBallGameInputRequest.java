package com.java.game.domain.baseballgame.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class BaseBallGameInputRequest {
    private String inputNum;
}