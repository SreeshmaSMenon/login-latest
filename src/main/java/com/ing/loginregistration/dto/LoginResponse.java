package com.ing.loginregistration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
  private Integer statusCode;
  private String statusMessage;
  private Long userId;
}
