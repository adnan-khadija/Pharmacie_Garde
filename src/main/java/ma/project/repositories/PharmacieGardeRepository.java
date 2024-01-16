package ma.project.repositories;


import ma.project.entities.PharmacieGarde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PharmacieGardeRepository extends JpaRepository<PharmacieGarde, Long> {
    List<PharmacieGarde> findByPharmacieId(Long pharmacieId);


}
