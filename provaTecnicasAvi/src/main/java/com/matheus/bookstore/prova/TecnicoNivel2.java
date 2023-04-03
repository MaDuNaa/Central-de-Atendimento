package com.matheus.bookstore.prova;

public class TecnicoNivel2 extends Tecnico{
	
	  public TecnicoNivel2() {
	        super(2);
	    }

	    public boolean resolverProblema(Problema problema) {
	        if (problema.getNivel() <= 2) {
	            System.out.println("Problema resolvido pelo técnico de nível 2");
	            return true;
	        } else if (proximo != null) {
	            return proximo.resolverProblema(problema);
	        } else {
	            return false;
	        }
	    }
	}
