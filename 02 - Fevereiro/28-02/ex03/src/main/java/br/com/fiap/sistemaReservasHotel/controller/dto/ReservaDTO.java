package br.com.fiap.sistemaReservasHotel.controller.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservaDTO {
    private String nome;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
}
