package org.acme.artilharia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artilharia {
    @Id @GeneratedValue public Long id;
    public Integer ano;
    public String nome;
    public Integer gols;
}
