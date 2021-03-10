package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.Kategories;
import project.loker.loker.repository.KategoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class KategoryService {

    @Autowired
    private KategoryRepository kategoryRepository;

    public List<Kategories> getAllKategories() {
        List<Kategories> kategories = new ArrayList<>();
        kategoryRepository.findAll().forEach(kategories::add);
        return kategories;
    }

    public Kategories getKategories(Long id) {
        Kategories kategories = kategoryRepository.findById(id).orElse(null);
        return kategories;
    }

    public Kategories addKategories(Kategories kategories) {
        kategoryRepository.save(kategories);
        return kategories;
    }

    public Kategories deleteKategories(Long id) {
        Kategories kategories = kategoryRepository.findById(id).orElse(null);
        kategoryRepository.deleteById(id);
        return kategories;
    }

    public Kategories deleteAllKategories(Kategories kategories) {
        kategoryRepository.deleteAll();
        return kategories;
    }

    public Kategories updateKategories(Long id, Kategories kategories) {
        kategoryRepository.save(kategories);
        return kategories;
    }

    
  //error
    // public Kategories replaceKategories(Long id){
    // Kategories kategories = kategoryRepository.findById(id).orElse(null);  
    // kategoryRepository.replaceById(id);  
    // return kategories;
  
    // }

}
