package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.Lokers;
import project.loker.loker.security.services.LokerService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/loker")
public class LokerController {

    @Autowired
    private LokerService lokerService;

    @RequestMapping(value = "/loker",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<Lokers> getAllLokers() {
        return lokerService.getAllLokers();
    }

    @RequestMapping(value = "/loker/{id}",
            produces = "application/json",
            method= RequestMethod.GET)
    public Lokers getLokers(@PathVariable Long id) {
        return lokerService.getLokers(id);
    }

    @RequestMapping(value = "/loker/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public Lokers addLokers(@RequestBody Lokers lokers) {
        return lokerService.addLokers(lokers);
    }

    // @RequestMapping(value = "/bidang",
    //         produces = "application/json",
    //         method= RequestMethod.DELETE)
    // public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
    //     return bidangService.deleteAllBidangPerusahaan(bidangPerusahaan);
    // }

    @RequestMapping(value = "/loker/{id}",
            produces = "application/json",
            method= RequestMethod.DELETE)
    public Lokers deleteLokers(@PathVariable Long id) {
        return lokerService.deleteLokers(id);
    }
}
