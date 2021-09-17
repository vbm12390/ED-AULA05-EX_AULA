package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.pilhastring.Pilha;

public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	public Pilha ContHistorico(Pilha historico, String dado, int opc) {
		switch (opc) {
			case 1: 
				if (dado.contains("www.") && dado.contains(".com")) {
					historico = inserir(historico, dado);
				}else {
					JOptionPane.showMessageDialog(null, "Link Inválido");
				}
			break;
			
			case 2:
				if (historico.size() >= 1) {
					historico = removerHistorico(historico, dado);
				}else {
					JOptionPane.showMessageDialog(null, "Sem Historico");
				}
			break;
			
			case 3:
				if (historico.size() >= 1) {
					ConsultarHistorico(historico, dado);
				}
			break;
			
			default:
		}
		return historico;
	}
	
	private void ConsultarHistorico(Pilha historico, String dado) {
		String site = "";
		try {
			site = historico.top();
			JOptionPane.showMessageDialog(null, "Ultimo site: " + site);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Pilha inserir(Pilha historico, String dado) {
		historico.push(dado);
		return historico;
	}
	
	private Pilha removerHistorico(Pilha historico, String dado) {
		try {
		historico.pop();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return historico;
	}
}







