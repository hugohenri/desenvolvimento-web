package exercicios;

import javax.swing.JOptionPane;


public class ex01 {
    
    public static void main(String[] args) {
        float resultado = 0;
        int sair = 0;
        int cont = 1;

        do {

            String num = JOptionPane.showInputDialog(null, "Digite o "+cont+"º numero:");
            float numDigi= Float.parseFloat(num);
            resultado = numDigi + resultado;
            cont ++;
            if(cont  > 2){
                int escolha = JOptionPane.showConfirmDialog(null, "Resulado da soma é: "+resultado+". Deseja continuar?", "Soma", JOptionPane.YES_NO_OPTION);

                sair = escolha;


            }

        } while (sair != 1);

        JOptionPane.showMessageDialog(null, "Resultado da soma é: "+resultado, "Soma", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
