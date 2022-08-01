package mx.tc.projectFinal.project.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity

public class ModelsReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id_reservation;
    private Integer id_car;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    //Getters and Setters
    public void setId_reservation(Integer id_reservation){
        this.id_reservation=id_reservation;
    }
    public Integer getId_reservationr(){
        return id_reservation;
    }
    public void setId_car(Integer id_car){
        this.id_car=id_car;
    }
    public Integer getId_car(){
        return id_car;
    }
    public void setStartDate(LocalDateTime startDate){
        this.startDate=startDate;
    }
    public LocalDateTime getStartDate(){
        return startDate;
    }
    public void setEndDAte(LocalDateTime endDate){
        this.endDate=endDate;
    }
    public LocalDateTime getEndDate(){
        return endDate;
    }
}
