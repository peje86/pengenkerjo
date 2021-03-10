package project.loker.loker.repository;

import java.util.Optional;
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.loker.loker.model.Kategories;


@Repository
public interface KategoryRepository extends JpaRepository<Kategories ,Long> {  //mengambil data dari depedency
List<Kategories>findAll();
// Optional<Kategories>replaceById(Long id);

// Optional<Kategories>findById(Long id);
// // //Optional<Products> findByUsername(String username);

}



