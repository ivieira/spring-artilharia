package org.acme.artilharia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilhariaService {

    @Autowired
    private ArtilhariaRepository repository;

    public List<Artilharia> getAll() {
        return repository.findAll();
    }

    public List<Artilharia> getAllByAno(Integer ano) {
        return repository.findAllByAno(ano);
    }
}
