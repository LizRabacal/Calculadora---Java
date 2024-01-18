/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.lang.Math;

public class CALCULADORA {

    boolean tem = false;
    boolean temdps = false;

    public void mostrar(JTextField painel, JButton botao) {
        String texto = painel.getText();
        painel.setText(texto + botao.getText());
    }

    public void apagar(JTextField painel) {
        int numero = painel.getText().length();
        if (painel.getText().substring(numero - 1, numero).equals(",")) {
            tem = false;
        }

        String apagado = painel.getText().substring(0, numero - 1);
        painel.setText(apagado);

    }

    public void apagartudo(JTextField painel) {
        painel.setText("");
        int numero = painel.getText().length();

        tem = false;

    }

    public void mostrarvirg(JTextField painel, JButton botao) {
        int ii = 0;

        int numero = painel.getText().length();
        String texto = painel.getText();
        String str = design.painell.getText();
        String[] listinha = str.split("");

        for (int i = ii; i < str.length(); i++) {
            if (listinha[i].equals(",")) {
                tem = true;
            } else if (((listinha[i].equals("+")) || (listinha[i].equals("*")) || (listinha[i].equals("-")) || (listinha[i].equals("/")))) {
                ii = i;
                tem = false;
                temdps = true;
            }
        }
        if (temdps == true) {
            if (painel.getText().substring(numero - 1, numero).equals(",") || ((painel.getText().substring(numero - 1, numero).equals("+")) || (painel.getText().substring(numero - 1, numero).equals("*")) || (painel.getText().substring(numero - 1, numero).equals("-")) || painel.getText().substring(numero - 1, numero).equals("/"))) {
                tem = true;
            }
        }
        if (tem == false) {
            painel.setText(texto + botao.getText());
            tem = true;
        }

    }

    public static String éop(JTextField painel) {
        int ii = 0;
        String retorno = "";
        String operacao = painel.getText();
        int bb = 0;
        int i2 = 0;
        String[] valorop = {" "};
        int numero = painel.getText().length();
        String texto = painel.getText();
        String str = painel.getText();
        String[] listinha = str.split("");
        String Str2 = "                                                                                                                                                                                                 ";
        String[] valorantes = Str2.split("");
        String Str3 = "                                                                                                                                                                                               ";
        String[] valordps = Str3.split("");
        Double Valor;
        int i;

        for (i = ii; i < str.length(); i++) {

            if ((listinha[i].equals("+")) || (listinha[i].equals("-")) || (listinha[i].equals("X")) || (listinha[i].equals("÷"))) {
                ii = i;
                for (i2 = ii + 1; i2 < numero; i2++) {
                    for (bb = 0; bb < numero; bb++) {
                      
                        valordps[i2] = listinha[i2];
                    }
                }

            }

        }

        if ((ii == 0)) {
            return texto;
        }

        for (i = 0; i < ii; i++) {
          
            valorantes[i] = listinha[i];

        }

        String string = Arrays.toString(valorantes).substring(1, 3 * valorantes.length - 1).replaceAll(", ", "");
        String string2 = Arrays.toString(valordps).substring(1, 3 * valordps.length - 1).replaceAll(", ", "");
        Double db1 = Double.parseDouble(string);
        Double db2 = Double.parseDouble(string2);
        Double soma = db1 + db2;
        Double sub = db1 - db2;
        Double mult = db1 * db2;
        Double div = db1 / db2;

        switch (listinha[ii]) {
            case "+":
                retorno = (soma.toString());
                break;
            case "-":
                retorno = (sub.toString());
                break;
            case "X":
                retorno = (mult.toString());
                break;
            case "÷":
                retorno = (div.toString());
                break;
        }
        return retorno;

    }

    public void jatemop(JTextField painel, JButton botaop) {
        CALCULADORA metodos2 = new CALCULADORA();
        String str = painel.getText();
        int ii = 0;
        String[] listinha = str.split("");
        int numero = painel.getText().length();
        for (int i = ii; i < str.length(); i++) {
            if ((listinha[i].equals("+")) || (listinha[i].equals("-")) || (listinha[i].equals("X")) || (listinha[i].equals("÷"))) {

                painel.setText(metodos2.éop(painel));

            }

        }

        metodos2.mostrar(painel, botaop);

    }

    public void raiz() {
        CALCULADORA metodos2 = new CALCULADORA();
        String valorzinho = metodos2.éop(design.painell);
        Double valorzinho2 = Double.parseDouble(valorzinho);
        Double result = Math.sqrt(valorzinho2);
        String result2 = result.toString();
        design.painell.setText(result2);

    }

    public void potencia() {
        CALCULADORA metodos2 = new CALCULADORA();
        String valorzinho = metodos2.éop(design.painell);
        Double valorzinho2 = Double.parseDouble(valorzinho);
        Double result = Math.pow(valorzinho2, 2);
        String result2 = result.toString();
        design.painell.setText(result2);

    }

}
