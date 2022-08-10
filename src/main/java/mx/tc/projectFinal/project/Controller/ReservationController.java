package mx.tc.projectFinal.project.Controller;

import mx.tc.projectFinal.project.Models.ModelsReservation;
import mx.tc.projectFinal.project.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/reservacion")
@CrossOrigin("*")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping(path="/{id_reservation}")
    public Optional<ModelsReservation> getByIDRes(@PathVariable("id_reservation")Integer id_reservation){
        return this.reservationService.getByIDReservation(id_reservation);
    }

    @PostMapping(path="/crearReserva")
    public ModelsReservation nuevaReser(@RequestBody ModelsReservation modelsReservation){
        return this.reservationService.newReservation(modelsReservation);
    }
}
