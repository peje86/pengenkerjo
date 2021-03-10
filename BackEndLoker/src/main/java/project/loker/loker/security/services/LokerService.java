package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.Lokers;
import project.loker.loker.repository.LokerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LokerService {

    @Autowired
    private LokerRepository lokerRepository;

    public List<Lokers> getAllLokers() {
        List<Lokers> lokers = new ArrayList<>();
        lokerRepository.findAll().forEach(lokers::add);
        return lokers;
    }

    public Lokers getLokers(Long id) {
        Lokers lokers = lokerRepository.findById(id).orElse(null);
        return lokers;
    }

    public Lokers addLokers(Lokers lokers) {
        lokerRepository.save(lokers);
        return lokers;
    }

    public Lokers deleteLokers(Long id) {
        Lokers lokers = lokerRepository.findById(id).orElse(null);
        lokerRepository.deleteById(id);
        return lokers;
    }

    public Lokers deleteAllLokers(Lokers lokers) {
        lokerRepository.deleteAll();
        return lokers;
    }

    public Lokers updateLokers(Long id, Lokers lokers) {
        lokerRepository.save(lokers);
        return lokers;
    }
}
