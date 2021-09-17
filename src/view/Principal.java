package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.vinicius.pilhastring.Pilha;
import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		HistoricoController hCont = new HistoricoController();
		Pilha historico = new Pilha();
		String dado = "";
		int opc = 0;
		Boolean validador = false;
		while (validador == false) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Consultar Histórico\n "
					+ "Digite...\n "
					+ "1- inserir um novo endereço\n"
					+ "2- Remover ultimo histórico\n"
					+ "3- Consultar o ultimo endereço\n"
					+ "4- Sair"));
			switch (opc) {
			case 1:
				dado = JOptionPane.showInputDialog("Digite o Link");
				historico = hCont.ContHistorico(historico, dado, opc);
				break;
			
			case 2:
				historico = hCont.ContHistorico(historico, dado, opc);
				
				break;
			case 3:
				historico = hCont.ContHistorico(historico, dado, opc);
				
				break;
			case 4:
				validador = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}

	}

}
