package com.example.demo.repository;
import com.example.demo.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
