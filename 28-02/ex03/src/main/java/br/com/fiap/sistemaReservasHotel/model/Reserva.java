package br.com.fiap.sistemaReservasHotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    private Long id;
    private String nome;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
}
