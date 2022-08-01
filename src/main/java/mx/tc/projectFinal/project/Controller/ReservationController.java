package mx.tc.projectFinal.project.Controller;

import mx.tc.projectFinal.project.Models.ModelsReservation;
import mx.tc.projectFinal.project.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/reservacion")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping(path="/{id_reservation}")
    public Optional<ModelsReservation> getByIDRes(@PathVariable("id_reservation")Integer id_reservation){
        return this.reservationService.getByIDReservation(id_reservation);
    }
}
