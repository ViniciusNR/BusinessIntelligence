/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@NamedQueries({@NamedQuery(name="venda_findAll",query="select v from Venda v")})
public class Venda implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.TABLE,generator="venda_seq")
    @SequenceGenerator(name="venda_seq",sequenceName="venda_seq",allocationSize=1,initialValue=1)
    @Id
    @Column(columnDefinition="BigSerial not null")
    private Integer id;
    @Column(nullable=false)
    private int idCliente;   
    @Column(nullable=false)
    private int idProduto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVenda;
    private int parcelas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}