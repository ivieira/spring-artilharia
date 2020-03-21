package org.acme.artilharia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/artilharia")
@RestController
public class ArtilhariaResource {

    @Autowired
    private ArtilhariaService service;

    @GetMapping()
    public List<Artilharia> getAll() {
        return service.getAll();
    }

    @GetMapping("/{ano}")
    public List<Artilharia> getAllByAno(@PathVariable Integer ano) {
        return service.getAllByAno(ano);
    }
}
