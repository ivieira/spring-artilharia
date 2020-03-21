package org.acme.artilharia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtilhariaRepository extends JpaRepository<Artilharia, Long> {

    List<Artilharia> findAllByAno(Integer ano);
}
