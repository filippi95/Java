/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author 31438938
 */
public class Laboratorio1 {

    private double valor;
    private int codigo;

    public Laboratorio1() {
        String entrada = JOptionPane.showInputDialog("Digite o valor do produto");
        valor = Double.parseDouble(entrada);

        String entrada2 = JOptionPane.showInputDialog("Digite o codigo do produto");
        codigo = Integer.parseInt(entrada2);

        switch (codigo) {
            case 1:
                valor = valor + valor * 0.10;
                break;
            case 3:
                valor = valor + valor * 0.25;
                break;
            case 4:
                valor = valor + valor * 0.30;
                break;
            case 8:
                valor = valor + valor * 0.50;
                break;
            default:
                JOptionPane.showMessageDialog(null, "ISSO NON ECZISTE!");

        }

        JOptionPane.showMessageDialog(null, "O valor final ficará " + valor+" reais");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Laboratorio1{" + "valor=" + valor + ", codigo=" + codigo + '}';
    }

    public static void main(String[] args) {
        Laboratorio1 ex1 = new Laboratorio1();

    }

}
