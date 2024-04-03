package br.com.fiap.sistemaReservasHotel.controller;

import br.com.fiap.sistemaReservasHotel.controller.dto.ReservaDTO;
import br.com.fiap.sistemaReservasHotel.controller.dto.ReservaUpdateDTO;
import br.com.fiap.sistemaReservasHotel.model.Reserva;
import br.com.fiap.sistemaReservasHotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    // Cria Reserva
    @PostMapping
    public ResponseEntity<Reserva> createReserva(@RequestBody ReservaDTO reservaDTO){
        Reserva reserva = reservaService.createReserva(reservaDTO);
        return ResponseEntity.ok(reserva);
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReserva(){
        return ResponseEntity.ok(reservaService.listarReserva());
    }

    @PutMapping("{id}")
    public ResponseEntity<List<Reserva>> updateReserva(@PathVariable Long id, @RequestBody ReservaUpdateDTO reservaUpdateDTO){
        Reserva reserva = (Reserva) reservaService.updateReserva(id, reservaUpdateDTO);
        if (reserva != null){
            return ResponseEntity.ok(Collections.singletonList(reserva));
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Reserva>> deleteReserva(@PathVariable Long id){
        reservaService.deleteReserva(id);
        return ResponseEntity.ok().build();
    }
}
