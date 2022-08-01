package mx.tc.projectFinal.project.Controller;
import mx.tc.projectFinal.project.Models.ModelsCars;
import mx.tc.projectFinal.project.Service.CarsService;
import mx.tc.projectFinal.project.Service.ReservationService;
import mx.tc.projectFinal.project.repository.CarsRepository;
import mx.tc.projectFinal.project.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path="/carros")
public class CarsController {
    @Autowired
    CarsService carsService;
    ReservationService reservationService;

    @GetMapping(path="/catalogo")
    public ArrayList<ModelsCars> getCars(){
        return carsService.getAllCars();
    }

    @GetMapping(path="/{id_car}")
    public Optional<ModelsCars> getById(@PathVariable("id_car")Integer id_car){
        return this.carsService.getByIDCar(id_car);
    }
    @GetMapping("/modelo/query")
    public ArrayList<ModelsCars> getCarByModel(@RequestParam("modelo") Integer modelo){
        return this.carsService.getByModel(modelo);
    }
    @GetMapping("/marca/query")
    public ArrayList<ModelsCars> getCarByMarca(@RequestParam("marca") String marca){
        return this.carsService.getByMarca(marca);
    }

}


