package br.com.fiap.api.techBrasil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Business {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_business")
	private Long codigo;
	
	@Column(name = "nm_negocio")
	private String nomeEmpresa;
	
	@Column(name = "ds_negocio")
	private String descricao;
	
	@Column(name = "nm_setor")
	private String setor;
	
	@Column(name = "tp_negocio")
	private String tipoNegocio;
	
	@Column(name = "vl_negocio")
	private double preco;
	
	@ManyToOne
	private BranchBusiness branch;

	public Business() {
		super();
	}

	public Business(Long codigo, String nomeEmpresa, String descricao, String setor, String tipoNegocio, double preco,
			BranchBusiness branch) {
		super();
		this.codigo = codigo;
		this.nomeEmpresa = nomeEmpresa;
		this.descricao = descricao;
		this.setor = setor;
		this.tipoNegocio = tipoNegocio;
		this.preco = preco;
		this.branch = branch;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public BranchBusiness getBranch() {
		return branch;
	}

	public void setBranch(BranchBusiness branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Business [codigo=" + codigo + ", nomeEmpresa=" + nomeEmpresa + ", descricao=" + descricao + ", setor="
				+ setor + ", tipoNegocio=" + tipoNegocio + ", preco=" + preco + ", branch=" + branch + "]";
	}

}
