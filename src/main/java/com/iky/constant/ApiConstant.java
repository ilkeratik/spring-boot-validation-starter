package com.iky.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiConstant {

  public static final String API_V1_PREFIX = "/api/v1/";
  public static final String RESERVATION_API_PREFIX = "reservation";
  public static final String RESERVATION_API_V1_PREFIX = API_V1_PREFIX + RESERVATION_API_PREFIX;
}
