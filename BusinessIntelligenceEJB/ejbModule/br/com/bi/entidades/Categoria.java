package br.com.bi.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQueries({@NamedQuery(name="categoria_findAll",query="select c from Categoria c")})
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.TABLE,generator="categoria_seq")
    @SequenceGenerator(name="categoria_seq",sequenceName="categoria_seq",allocationSize=1,initialValue=1)
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(length=20,nullable=false)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}