package com.company;
import java.io.*;
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

    public char[][] ler() throws IOException {
        char temp[][] = new char[1024][32];
        BufferedReader br = new BufferedReader(new FileReader("HD.txt"));
        /*
        int j = 0,i = 0;
        for (i = 0; i < 1024; i++){
            String linha = br.readLine();
            for(j = 0; j < 32; j++){
                //String linha = br.readLine();
                //temp[i][j] = linha.toCharArray();;
            }
            temp[i] = linha.toCharArray();
        }

         */
        while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
        }
        br.close();
        return temp;
    }
}
