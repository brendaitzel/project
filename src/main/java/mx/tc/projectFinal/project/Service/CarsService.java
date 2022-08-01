package mx.tc.projectFinal.project.Service;

import mx.tc.projectFinal.project.Models.ModelsCars;
import mx.tc.projectFinal.project.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.ArrayList;

@Service

public class CarsService {
    @Autowired
    CarsRepository carsRepository;

    public ArrayList<ModelsCars> getAllCars(){

        return (ArrayList<ModelsCars>) carsRepository.findAll();
    }
    public Optional<ModelsCars> getByIDCar(Integer id_car){
        return carsRepository.findById(id_car);
    }
    public ArrayList<ModelsCars> getByModel(Integer modelo){
        return carsRepository.findBymodelo(modelo);
    }
    public ArrayList<ModelsCars>getByMarca(String marca){
        return carsRepository.findBymarca(marca);
    }

}
