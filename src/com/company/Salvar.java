package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Salvar {
    /**
     *
     * o exemplo da tabuada sera alterado mais para frente
     */
    public void teste(char matriz[][]) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i;

        System.out.printf("Informe o número para a tabuada:\n");
        //n = ler.nextInt();

        FileWriter arq = new FileWriter("tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        for (i=0; i<1024; i++) {
            for (int j = 0; j < 32; j++) {
                gravarArq.printf("%c", matriz[i][j]);
            }

            gravarArq.printf("\n");
        }
        arq.close();
    }
}
