package com.matheus.bookstore.prova;

public class TecnicoNivel3 extends Tecnico{
	
	   public TecnicoNivel3() {
	        super(3);
	    }

	    public boolean resolverProblema(Problema problema) {
	        if (problema.getNivel() <= 3) {
	            System.out.println("Problema resolvido pelo técnico de nível 3");
	            return true;
	        } else if (proximo != null) {
	            return proximo.resolverProblema(problema);
	        } else {
	            return false;
	        }
	    }
	}

