package com.matheus.bookstore.prova;

public class CentralSuporte {
	
    private Tecnico primeiro;

    public CentralSuporte() {
        primeiro = new TecnicoNivel1();
        Tecnico tecnico2 = new TecnicoNivel2();
        Tecnico tecnico3 = new TecnicoNivel3();

        primeiro.setProximo(tecnico2);
        tecnico2.setProximo(tecnico3);
    }

    public void resolverProblema(Problema problema) {
        if (primeiro.resolverProblema(problema) == false) {
            System.out.println("Não foi possível resolver o problema.");
        }
      }
    }