package com.iky.dto;


import com.iky.controller.validation.ValidEnum;
import com.iky.enumeration.ReservationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ReservationDTO {

  private String id;
  @NotNull(message = "Total price is required.")
  private int totalPrice;
  @NotBlank(message = "Currency is required.")
  private String currency;
  @NotBlank(message = "Origin Country is required.")
  private String originCountry;
  @NotBlank(message = "Customer no is required.")
  private String customerNo;
  @NotBlank(message = "Type is required.")
  @ValidEnum(enumClass = ReservationType.class,
      message = "Invalid value. Allowed values are: FLIGHT, RENTAL_CAR")
  private String type;
  @NotBlank(message = "Description is required.")
  private String description;
}
