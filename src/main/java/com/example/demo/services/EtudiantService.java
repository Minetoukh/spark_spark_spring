package com.example.demo.services;

import com.example.demo.model.Etudiant;

import com.example.demo.repository.EtudiantRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> getEtudiantById(Long id) {
        return etudiantRepository.findById(id);
    }

    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Long id, Etudiant updatedEtudiant) {
        if (etudiantRepository.existsById(id)) {
            updatedEtudiant.setId(id);
            return etudiantRepository.save(updatedEtudiant);
        }
        return null;
    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}
