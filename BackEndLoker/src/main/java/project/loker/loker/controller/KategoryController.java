package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.Kategories;
import project.loker.loker.security.services.KategoryService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/kategory")
public class KategoryController {

    @Autowired
    private KategoryService kategoryService;

    @RequestMapping(value = "/kategory",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<Kategories> getAllKategories() {
        return kategoryService.getAllKategories();
    }

    @RequestMapping(value = "/kategory/{id}",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public Kategories getKategories(@PathVariable Long id) {
        return kategoryService.getKategories(id);
    }

    @RequestMapping(value = "/kategory/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public Kategories addKategories(@RequestBody Kategories kategories) {
        return kategoryService.addKategories(kategories);
    }

    @RequestMapping(value = "/kategory",
            produces = "application/json",
            method= RequestMethod.DELETE)
            @PreAuthorize(" hasRole('ADMIN')")
    public Kategories deleteAllKategories(Kategories kategories) {
        return kategoryService.deleteAllKategories(kategories);
    }

    @RequestMapping(value = "/kategory/{id}",
            produces = "application/json",
            method= RequestMethod.DELETE)
    @PreAuthorize(" hasRole('ADMIN')")
    public Kategories deleteKategories(@PathVariable Long id) {
        return kategoryService.deleteKategories(id);
    }

    //error

//     @RequestMapping("/updatekategory/{id}")//tipe biomahasisa
//     @PreAuthorize(" hasRole('ADMIN')")
//     public Kategories updateKategories(@RequestBody Kategories newKategories, @PathVariable Long id){
//     return kategoryService.findById(id)
//     .map(kategory->{
//         kategory.setNamaKategori(newKategories.getNameKategori());
//         kategory.setId(newKategories.getId());
//         return kategoryService.save(newKategories);
//     }).orElseGet(()->{
//         newKategories.setId(id);
//         return kategoryService.save(newKategories);
//     });
// }

}

