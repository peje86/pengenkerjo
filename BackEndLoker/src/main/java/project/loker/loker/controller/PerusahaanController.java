package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.Perusahaans;
import project.loker.loker.security.services.PerusahaanService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/perusahaan")
public class PerusahaanController {

    @Autowired
    private PerusahaanService perusahaanService;

    @RequestMapping(value = "/perusahaan",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<Perusahaans> getAllPerusahaans() {
        return perusahaanService.getAllPerusahaans();
    }

    @RequestMapping(value = "/perusahaan/{id}",
            produces = "application/json",
            method= RequestMethod.GET)
    public Perusahaans getPerusahaans(@PathVariable Long id) {
        return perusahaanService.getPerusahaans(id);
    }

    @RequestMapping(value = "/perusahaan/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public Perusahaans addPerusahaans(@RequestBody Perusahaans perusahaans) {
        return perusahaanService.addPerusahaans(perusahaans);
    }

    // @RequestMapping(value = "/bidang",
    //         produces = "application/json",
    //         method= RequestMethod.DELETE)
    // public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
    //     return bidangService.deleteAllBidangPerusahaan(bidangPerusahaan);
    // }

    @RequestMapping(value = "/perusahaan/{id}",
            produces = "application/json",
            method= RequestMethod.DELETE)
    public Perusahaans deletePerusahaans(@PathVariable Long id) {
        return perusahaanService.deletePerusahaans(id);
    }
}
