/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        int op = -1;

        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog("\"Qual conta você deseja acessar?"
                    + "\n1 - Conta Poupança"
                    + "\n2 - Conta Corrente"
                    + "\n0 - Sair"));

            switch (op) {
                case 1:
                    if (cp.getNome() == null || cp.getNome().isEmpty()) {
                        String nomecp = JOptionPane.showInputDialog("Digite o nome do titular da Conta Poupança:");
                        cp.setNome(nomecp);
                        double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de serviço (%):"));
                        cp.setJuros(juros);
                    }
                    int contap = -1;
                    while (contap != 0) {
                        contap = Integer.parseInt(JOptionPane.showInputDialog("Conta Poupança de " + cp.getNome() + ":\n" + "Taxa de Juros: "
                                + String.format("%.0f", cp.getJuros())
                                + "%\n"
                                + "1 - Depositar\n"
                                + "2 - Consultar Saldo\n"
                                + "3 - Alterar a taxa de juros\n"
                                + "0 - Voltar"));
                        switch (contap) {
                            case 1:
                                double depositarcp = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                                cp.setDeposito(depositarcp);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Saldo atual da conta: " + "R$" + cp.getSaldo());
                                break;
                            case 3:
                                double jurosnovos = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor da taxa de juros (%):"));
                                cp.setJuros(jurosnovos);
                                JOptionPane.showMessageDialog(null, "A taxa do Juros foi alterada para: " + String.format("%.0f", jurosnovos) + "%");
                            case 0:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }
                    break;
                case 2:
                    if (cc.getNome() == null || cc.getNome().isEmpty()) {
                        String nomecc = JOptionPane.showInputDialog("Digite o nome do titular da conta corrente:");
                        cc.setNome(nomecc);
                        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de serviço (%):"));
                        cc.setTaxadeservico(taxa);
                    }

                    int contacc = -1;
                    while (contacc != 0) {
                        contacc = Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente de "
                                + cc.getNome()
                                + ":\n"
                                + "Taxa de serviço: "
                                + String.format("%.0f", cc.getTaxadeservico())
                                + "%\n"
                                + "1 - Depositar\n"
                                + "2 - Consultar Saldo\n"
                                + "3 - Alterar a taxa\n"
                                + "0 - Voltar"));
                        switch (contacc) {
                            case 1:
                                double depositarcc = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                                cc.setDeposito(depositarcc);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Saldo atual da conta: " + "R$" + cc.getSaldo());
                                break;
                            case 3:
                                double novaTaxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor da taxa de serviço (%):"));
                                cc.setTaxadeservico(novaTaxa);
                                JOptionPane.showMessageDialog(null, "Taxa de serviço alterada para: " + String.format("%.0f", novaTaxa) + "%");
                                break;
                            case 0:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
