package mx.tc.projectFinal.project.Service;
import mx.tc.projectFinal.project.Models.ModelsReservation;
import mx.tc.projectFinal.project.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service

public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public Optional<ModelsReservation> getByIDReservation(Integer id_reservation){
        return reservationRepository.findById(id_reservation);
    }
}
