package com.williamdsw.cursomodelagemconceitual.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.williamdsw.cursomodelagemconceitual.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento
{
	// ------------------------------------------------------------------------------------//
	// CAMPOS
	
	private static final long serialVersionUID = 1L;
	private Date dataVencimento;
	private Date dataPagamento;
	
	// ------------------------------------------------------------------------------------//
	// CONSTRUTORES
	
	public PagamentoComBoleto () {}
	public PagamentoComBoleto (Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataVencimento, Date dataPagamento)
	{ 
		super (id, estadoPagamento, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	// ------------------------------------------------------------------------------------//
	// GETTERS / SETTERS
	
	public Date getDataVencimento ()
	{ return dataVencimento; }

	public void setDataVencimento (Date dataVencimento)
	{ this.dataVencimento = dataVencimento; }

	public Date getDataPagamento ()
	{ return dataPagamento; }

	public void setDataPagamento (Date dataPagamento)
	{ this.dataPagamento = dataPagamento; }
}