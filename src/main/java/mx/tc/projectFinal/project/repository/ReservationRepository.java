package mx.tc.projectFinal.project.repository;
import org.springframework.data.repository.CrudRepository;
import mx.tc.projectFinal.project.Models.ModelsReservation;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepository extends CrudRepository<ModelsReservation, Integer>{
}
