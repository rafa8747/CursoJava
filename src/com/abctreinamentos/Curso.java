package com.abctreinamentos;
// Generated 29/07/2018 16:21:42 by Hibernate Tools 4.3.5.Final

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cdcurso;
	private String nome;
	private long valor;
	private String url;

	public Curso() {
	}

	public Curso(long cdcurso, String nome, long valor, String url) {
		this.cdcurso = cdcurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}

	public long getCdcurso() {
		return this.cdcurso;
	}

	public void setCdcurso(long cdcurso) {
		this.cdcurso = cdcurso;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getValor() {
		return this.valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Curso [ CD Curso =" + cdcurso + " Nome = " + nome + " Valor = " + valor + " URL = " +  url + " ]";
	}
	
}
