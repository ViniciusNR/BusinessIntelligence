package br.com.bi.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grupo
 *
 */
@Entity
@NamedQueries({@NamedQuery(name="grupo_findAll",query="select g from Grupo g")})
public class Grupo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.TABLE,generator="grupo_seq")
    @SequenceGenerator(name="grupo_seq",sequenceName="grupo_seq",allocationSize=1,initialValue=1)
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(length=20,nullable=false)
    private String nome;
    @Column(length=200)
    private String descricao;
    @ManyToMany(mappedBy="grupos")
    private List<Usuario> usuarios;
    
    public Grupo() {
        super();
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * @return the usuario
     */
    public List<Usuario> getUsuario() {
        return usuarios;
    }
    
    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(List<Usuario> usuario) {
        this.usuarios = usuario;
    }
    
    /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    
    /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Grupo other = (Grupo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
        return "Grupo [nome=" + nome + "]";
    }
    
}
