package com.iky.controller;

import static com.iky.constant.ApiConstant.RESERVATION_API_V1_PREFIX;

import com.iky.dto.ReservationDTO;
import com.iky.dto.ReservationFilterParameters;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RESERVATION_API_V1_PREFIX)

public class ReservationController {


  @PostMapping
  public ResponseEntity<String> addReservation(@Valid @RequestBody ReservationDTO reservationDTO) {
    return ResponseEntity.ok(reservationDTO.toString());
  }

  @GetMapping("filter")
  public ResponseEntity<String> filterReservations(
      @Valid @ModelAttribute ReservationFilterParameters parameters) {
    return ResponseEntity.ok(parameters.toString());
  }


}
