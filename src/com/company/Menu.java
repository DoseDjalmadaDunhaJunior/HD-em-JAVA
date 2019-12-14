package com.company;

import java.io.IOException;

//a função abaixo será o menu, para ficar organizado
public class Menu {
    public Menu() throws IOException {
        Salvar oi = new Salvar();
        char m[][] = new char[1024][32];
        for(int i = 0; i < 1024; i++){
            for(int j = 0; j < 32; j++){
                m[i][j] = ' ';
            }
        }
        oi.save(m);
    }
}
