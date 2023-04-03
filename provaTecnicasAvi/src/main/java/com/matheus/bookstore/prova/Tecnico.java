package com.matheus.bookstore.prova;

public abstract class Tecnico {
	
	 protected int nivel;
	    protected Tecnico proximo;

	    public Tecnico(int nivel) {
	        this.nivel = nivel;
	    }

	    public void setProximo(Tecnico proximo) {
	        this.proximo = proximo;
	    }

	    public abstract boolean resolverProblema(Problema problema);
	}


