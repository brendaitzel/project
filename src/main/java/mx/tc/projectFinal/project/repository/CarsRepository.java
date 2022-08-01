package mx.tc.projectFinal.project.repository;
import org.springframework.data.repository.CrudRepository;
import mx.tc.projectFinal.project.Models.ModelsCars;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CarsRepository extends CrudRepository<ModelsCars,Integer>{
    public abstract ArrayList<ModelsCars> findBymodelo(Integer modelo);
    public abstract ArrayList<ModelsCars> findBymarca(String marca);


}
