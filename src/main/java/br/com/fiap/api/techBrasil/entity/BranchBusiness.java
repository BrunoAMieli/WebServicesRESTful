package br.com.fiap.api.techBrasil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.api.techBrasil.model.Sector;
import br.com.fiap.api.techBrasil.model.TypeBusiness;

@Entity
@Table(name = "T_Branch_Business")
public class BranchBusiness {

	@Id
	@SequenceGenerator(name = "branch", sequenceName = "SQ_T_Branch_Business", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch")
	@Column(name = "id_branch")
	private int codigo;
	
	@Column(name = "nm_setor")
	private Sector nomeSetor;
	
	@Column(name = "nm_tipo_branch")
	private TypeBusiness tipoBranch;

	public BranchBusiness() {
		super();
	}

	public BranchBusiness(int codigo, Sector nomeSetor, TypeBusiness tipoBranch) {
		super();
		this.codigo = codigo;
		this.nomeSetor = nomeSetor;
		this.tipoBranch = tipoBranch;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Sector getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(Sector nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public TypeBusiness getTipoBranch() {
		return tipoBranch;
	}

	public void setTipoBranch(TypeBusiness tipoBranch) {
		this.tipoBranch = tipoBranch;
	}

	@Override
	public String toString() {
		return "BranchBusiness [codigo=" + codigo + ", nomeSetor=" + nomeSetor + ", tipoBranch=" + tipoBranch + "]";
	}
	
}
