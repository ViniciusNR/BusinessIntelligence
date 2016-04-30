package br.com.bi.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
@NamedQueries({@NamedQuery(name="cliente_findAll",query="select c from Cliente c")})
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.TABLE,generator="cliente_seq")
    @SequenceGenerator(name="cliente_seq",sequenceName="cliente_seq",allocationSize=1,initialValue=1)
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(length=20,nullable=false)
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date aniversario;
    @Column(length=50)
    private String email;
    @Column(length=20)
    private int telefone;
    @Column(length=60)
    private String endereco;

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

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}