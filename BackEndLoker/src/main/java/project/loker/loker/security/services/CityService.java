package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.Cities;
import project.loker.loker.repository.CityRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<Cities> getAllCities() {
        List<Cities> cities = new ArrayList<>();
        cityRepository.findAll().forEach(cities::add);
        return cities;
    }

    public Cities getCities(Long id) {
        Cities cities = cityRepository.findById(id).orElse(null);
        return cities;
    }

    public Cities addCities(Cities cities) {
        cityRepository.save(cities);
        return cities;
    }

    public Cities deleteCities(Long id) {
        Cities cities = cityRepository.findById(id).orElse(null);
        cityRepository.deleteById(id);
        return cities;
    }

    public Cities deleteAllCities(Cities cities) {
        cityRepository.deleteAll();
        return cities;
    }

    public Cities updateCities(Long id, Cities cities) {
        cityRepository.save(cities);
        return cities;
    }
}
