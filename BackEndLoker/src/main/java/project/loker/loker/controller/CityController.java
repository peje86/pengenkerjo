package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.Cities;
import project.loker.loker.security.services.CityService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<Cities> getAllCities() {
        return cityService.getAllCities();
    }

    // @RequestMapping(value = "/bidang/{id}",
    //         produces = "application/json",
    //         method= RequestMethod.GET)
    // public BidangPerusahaan getBidangPerusahaan(@PathVariable Long id) {
    //     return bidangService.getBidangPerusahaan(id);
    // }

    @RequestMapping(value = "/city/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public Cities addCities(@RequestBody Cities cities) {
        return cityService.addCities(cities);
    }

    // @RequestMapping(value = "/bidang",
    //         produces = "application/json",
    //         method= RequestMethod.DELETE)
    // public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
    //     return bidangService.deleteAllBidangPerusahaan(bidangPerusahaan);
    // }

    // @RequestMapping(value = "/bidang/{id}",
    //         produces = "application/json",
    //         method= RequestMethod.DELETE)
    // public BidangPerusahaan deleteBidangPerusahaan(@PathVariable Long id) {
    //     return bidangService.deleteBidangPerusahaan(id);
    // }
}
