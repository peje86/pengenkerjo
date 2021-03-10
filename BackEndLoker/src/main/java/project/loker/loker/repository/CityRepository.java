package project.loker.loker.repository;

import java.util.Optional;
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.loker.loker.model.Cities;


@Repository
public interface CityRepository extends JpaRepository<Cities ,Long> {  //mengambil data dari depedency
List<Cities>findAll();
// Optional<Perusahaans>findById(Long id);
// // //Optional<Products> findByUsername(String username);

}



