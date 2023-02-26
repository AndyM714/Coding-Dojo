package andy.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andy.dojosandninjas.dojos_ninjas.models.Ninja;
import andy.dojosandninjas.dojos_ninjas.repository.NinjaRepository;

@Service
public class NinjaService {
    // service talks to the repo
    // coonect servive to repo
    @Autowired NinjaRepository ninjaRepository;
    
    public Ninja createNinja( Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll();
    }
}