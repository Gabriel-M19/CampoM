package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), 
				tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(null)));
		
		tabuleiro.registrarObservador(e -> {
			//TODO mostrar resultado pro usuario!
			
		});	
	}
}

