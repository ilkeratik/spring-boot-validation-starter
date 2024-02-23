package com.iky.dto;

import static com.iky.constant.CommonConstant.DEFAULT_DATE_FORMAT;

import com.iky.controller.validation.ValidDate;
import com.iky.controller.validation.ValidEnum;
import com.iky.enumeration.ReservationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ReservationFilterParameters {

  @NotBlank
  private String customerNo;

  @ValidDate(message = "Invalid date, sinceDate should be today or in the past. "
      + "Please use the format " + DEFAULT_DATE_FORMAT)
  private String sinceDate;

  @ValidDate(message = "Invalid date, untilDate should be today or in the past. "
      + "Please use the format " + DEFAULT_DATE_FORMAT)
  private String untilDate;

  @ValidEnum(enumClass = ReservationType.class,
      message = "Invalid value. Allowed values are: FLIGHT, RENTAL_CAR")
  private String type;
  
  @Min(1)
  private int maxResults;
}
