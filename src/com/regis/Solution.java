package com.regis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * John trabalha em uma loja de roupas. Ele tem uma grande pilha de meias que ele deve emparelhar por cores para venda. Dada uma matriz de números inteiros representando a cor de cada meia,
 *     determine quantos pares de meias com as cores correspondentes.
 *     
 *
 *
 *
 *
 *
 */

public class Solution {
	

	public static void main(String[] args) {
        int n = 9;

        int[] ar = new int[n];

        String[] arItems = {"10", "20", "20", "10", "10", "30", "50", "10", "20"};

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("# result: " + result); // Teste
	}
	
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	HashMap<Integer, Float> mapa = new HashMap();
    	
    	for (int a : ar) {
			if (mapa.containsKey(a)) {    				
				mapa.put(a, mapa.get(a)+1);
			} else {
				mapa.put(a, 1f);
			}
    	}
    	
    	int qtdPares = 0;
    	
    	for (Float valor : mapa.values()) {
    		int intValor = (int) (valor/2);
    		qtdPares = qtdPares + intValor;
    	}
    	
    	System.out.println("# mapa: " + mapa);
    	System.out.println("# qtdPares: " + qtdPares);
    	
    	return qtdPares;
    }

}