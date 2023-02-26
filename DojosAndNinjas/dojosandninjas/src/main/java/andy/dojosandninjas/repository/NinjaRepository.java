package andy.dojosandninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import andy.dojosandninjas.dojos_ninjas.models.Ninja;

@Repository

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
    List<Ninja> findAll();
}