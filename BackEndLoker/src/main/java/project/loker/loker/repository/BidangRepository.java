package project.loker.loker.repository;

import java.util.Optional;
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.loker.loker.model.BidangPerusahaan;


@Repository
public interface BidangRepository extends JpaRepository<BidangPerusahaan ,Long> {  //mengambil data dari depedency
List<BidangPerusahaan>findAll();
Optional<BidangPerusahaan>findById(Long id);
// //Optional<Products> findByUsername(String username);

}



