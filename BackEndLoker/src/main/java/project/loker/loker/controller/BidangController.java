package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.BidangPerusahaan;
// import project.loker.loker.model.User;
import project.loker.loker.security.services.BidangService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bidang")
public class BidangController {

    @Autowired
    private BidangService bidangService;

    @RequestMapping(value = "/bidang",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<BidangPerusahaan> getAllBidangPerusahaan() {
        return bidangService.getAllBidangPerusahaan();
    }

    @RequestMapping(value = "/bidang/{id}",
            produces = "appliation/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public BidangPerusahaan getBidangPerusahaan(@PathVariable Long id) {
        return bidangService.getBidangPerusahaan(id);
    }

    @RequestMapping(value = "/bidang/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public BidangPerusahaan addBidangPerusahaan(@RequestBody BidangPerusahaan bidangPerusahaan) {
        return bidangService.addBidangPerusahaan(bidangPerusahaan);
    }

    @RequestMapping(value = "/bidang",
            produces = "application/json",
            method= RequestMethod.DELETE)
    @PreAuthorize(" hasRole('ADMIN')")
    public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
        return bidangService.deleteAllBidangPerusahaan(bidangPerusahaan);
    }

    @RequestMapping(value = "/bidang/{id}",
            produces = "application/json",
            method= RequestMethod.DELETE)
    @PreAuthorize(" hasRole('ADMIN')")
    public BidangPerusahaan deleteBidangPerusahaan(@PathVariable Long id) {
        return bidangService.deleteBidangPerusahaan(id);
    }
}
