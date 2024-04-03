package br.com.fiap.sistemaReservasHotel.service;

import br.com.fiap.sistemaReservasHotel.controller.dto.ReservaDTO;
import br.com.fiap.sistemaReservasHotel.controller.dto.ReservaUpdateDTO;
import br.com.fiap.sistemaReservasHotel.model.Reserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ReservaService {
    private final List<Reserva> listReservas = new ArrayList<>();

    private final AtomicLong counter = new AtomicLong();

    // Metodo para Criar a Reserva do Cliente
    public Reserva createReserva(ReservaDTO reservaDTO){
        Reserva reserva = new Reserva();
        reserva.setId(counter.incrementAndGet());
        reserva.setNome(reservaDTO.getNome());
        reserva.setCheckIn(reservaDTO.getCheckIn());
        reserva.setCheckOut(reservaDTO.getCheckOut());
        listReservas.add(reserva);
        return reserva;
    }

    // Metodo para Visualizar as Reservas dos Clientes
    public List<Reserva> listarReserva(){
        return listReservas;
    }

    // Metodo para Atualizar as Reservas do Cliente
    public List<Reserva> updateReserva(Long id, ReservaUpdateDTO reservaUpdateDTO){
        Reserva reserva = listReservas.get(Math.toIntExact(id));
        if (reserva != null){
            reserva.setNome(reservaUpdateDTO.getNome());
        }
        return (List<Reserva>) reserva;
    }

    // Metodo para Remover as Reservas do Cliente
    public void deleteReserva(Long id){
        listReservas.remove(id);
    }
}
