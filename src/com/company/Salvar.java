package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Salvar {

    //essa função salva a matriz
    public void save(char[][] matriz) throws IOException {
        int i;
        FileWriter arq = new FileWriter("HD.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        for (i=0; i < 1024; i++) {
            for (int j = 0; j < 32; j++) {
                gravarArq.printf("%c", matriz[i][j]);
            }
            gravarArq.printf("\n");
        }
        arq.close();
    }
}
