package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.BidangPerusahaan;
import project.loker.loker.repository.BidangRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BidangService {

    @Autowired
    private BidangRepository bidangRepository;

    public List<BidangPerusahaan> getAllBidangPerusahaan() {
        List<BidangPerusahaan> bidangPerusahaan = new ArrayList<>();
        bidangRepository.findAll().forEach(bidangPerusahaan::add);
        return bidangPerusahaan;
    }

    public BidangPerusahaan getBidangPerusahaan(Long id) {
        BidangPerusahaan bidangPerusahaan = bidangRepository.findById(id).orElse(null);
        return bidangPerusahaan;
    }

    public BidangPerusahaan addBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
        bidangRepository.save(bidangPerusahaan);
        return bidangPerusahaan;
    }

    public BidangPerusahaan deleteBidangPerusahaan(Long id) {
        BidangPerusahaan bidangPerusahaan = bidangRepository.findById(id).orElse(null);
        bidangRepository.deleteById(id);
        return bidangPerusahaan;
    }

    public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
        bidangRepository.deleteAll();
        return bidangPerusahaan;
    }

    public BidangPerusahaan updateBidangPerusahaan(Long id, BidangPerusahaan bidangPerusahaan) {
        bidangRepository.save(bidangPerusahaan);
        return bidangPerusahaan;
    }
}
