package co.edu.uniquindio.gimnasio.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reserva {
    private LocalDateTime fechaReserva;
    private Cliente cliente;
    private String codigo;

}
