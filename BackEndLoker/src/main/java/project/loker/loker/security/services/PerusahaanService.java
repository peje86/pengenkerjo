package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.Perusahaans;
import project.loker.loker.repository.PerusahaanRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerusahaanService {

    @Autowired
    private PerusahaanRepository perusahaanRepository;

    public List<Perusahaans> getAllPerusahaans() {
        List<Perusahaans> perusahaans = new ArrayList<>();
        perusahaanRepository.findAll().forEach(perusahaans::add);
        return perusahaans;
    }

    public Perusahaans getPerusahaans(Long id) {
        Perusahaans perusahaans = perusahaanRepository.findById(id).orElse(null);
        return perusahaans;
    }

    public Perusahaans addPerusahaans(Perusahaans perusahaans) {
        perusahaanRepository.save(perusahaans);
        return perusahaans;
    }

    public Perusahaans deletePerusahaans(Long id) {
        Perusahaans perusahaans = perusahaanRepository.findById(id).orElse(null);
        perusahaanRepository.deleteById(id);
        return perusahaans;
    }

    public Perusahaans deleteAllPerusahaans(Perusahaans perusahaans) {
        perusahaanRepository.deleteAll();
        return perusahaans;
    }

    public Perusahaans updatePerusahaans(Long id, Perusahaans perusahaans) {
        perusahaanRepository.save(perusahaans);
        return perusahaans;
    }
}
