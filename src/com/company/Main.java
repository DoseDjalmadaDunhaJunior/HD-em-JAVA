package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	Salvar oi = new Salvar();
	//char matriz[][]  = new char[4][4];
        char m[][] = new char[1024][32];
        for(int i = 0; i < 1024; i++){
	    for(int j = 0; j < 32; j++){
	        m[i][j] = 'a';
	        //matriz[i][j] = (char) i;
        }
    }
	oi.teste(m);
    }
}
