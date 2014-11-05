package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;

@Entity
@Table(name = "ITEM_ESTOQUE")
@Configurable
public class ItemEstoque extends AbstractEntity {

	@Basic
	private BigDecimal quantidade;

	@ManyToOne
	@JoinColumn
	private Medicamento medicamento;

	@ManyToOne
	@JoinColumn
	private Estoque estoque;
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

}
