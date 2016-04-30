package br.com.bi.entidade;

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
@NamedQueries({@NamedQuery(name="produto_findAll",query="select p from Produto p")})
public class Produto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.TABLE,generator="produto_seq")
    @SequenceGenerator(name="produto_seq",sequenceName="produto_seq",allocationSize=1,initialValue=1)
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(length=20,nullable=false)
    private String nome;
    private double valor;
    private Categoria categoria;

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}