package br.com.bi.entidade;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@NamedQueries({
    @NamedQuery(name="usuario_findAll",query="select u from Usuario u"),
    @NamedQuery(name="usuario_findByUserName",query="select u from Usuario u where u.username = :username"),
    @NamedQuery(name="usuario_findByUserNameEmail",query="select u from Usuario u where u.username = :username and u.email = :email")
})
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @SequenceGenerator(name="usuario_seq",sequenceName="usuario_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE,generator="usuario_seq")
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(unique=true,length=20,nullable=false)
    private String username;
    @Column(length=32,columnDefinition="varchar",nullable=false)
    private String senha;
    @Column(length=60,nullable=false)
    private String nome;
    @Column(length=60)
    private String email;
    @Column(length=20)
    private String telefone;
    private boolean ativo;
    private boolean alterarSenha;
    
    @ManyToMany
    @JoinTable(name = "usuario_grupo",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "grupo_id"))
    private List<Grupo> grupos;
    
    
    public Usuario() {
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    
    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }
    
    
    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    
    
    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }
    
    
    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    /**
     * @return the alterarSenha
     */
    public boolean isAlterarSenha() {
        return alterarSenha;
    }
    
    
    /**
     * @param alterarSenha the alterarSenha to set
     */
    public void setAlterarSenha(boolean alterarSenha) {
        this.alterarSenha = alterarSenha;
    }
    
    /**
     * @return the grupo
     */
    public List<Grupo> getGrupos() {
        return grupos;
    }
    
    
    /**
     * @param grupo the grupo to set
     */
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
    
}
