package com.matheus.bookstore.prova;

public class TecnicoNivel1 extends Tecnico{
	
	  public TecnicoNivel1() {
	        super(1);
	    }

	    public boolean resolverProblema(Problema problema) {
	        if (problema.getNivel() <= 1) {
	            System.out.println("Problema resolvido pelo técnico de nível 1");
	            return true;
	        } else if (proximo != null) {
	            return proximo.resolverProblema(problema);
	        } else {
	            return false;
	        }
	    }
	}
