package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
	Salvar oi = new Salvar();
	//char matriz[][]  = new char[4][4];
        int m[][] = new int[10][10];
        for(int i = 0; i < 10; i++){
	    for(int j = 0; j < 10; j++){
	        m[i][j] = i;
	        //matriz[i][j] = (char) i;
        }
    }
	//oi.teste(matriz);
    }
}
