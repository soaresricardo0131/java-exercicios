package org.example;

public class CrescenteDecrescente {
    public static void main(String[] args) {

        //ORDENAÇÃO DE VETOR EM ORDEM CRESCENTE

        int[] vetor1 = {10,5,8,2,1};
        int[] vetor2 = {10,5,8,2,1};

        ordemCrescente(vetor1);
        exibir(vetor1);

        System.out.println("========================");

        ordemDecrescente(vetor2);
        exibir(vetor2);
    }

    public static void ordemCrescente(int[] v){

        for(int i = 0; i < v.length-1;i++){
            int auxiliar = i;
            for (int j = i+1; j < v.length;j++){
                if (v[j] < v[auxiliar]){
                    auxiliar = j;
                }

            }
            int temp = v[auxiliar];
            v[auxiliar] = v[i];
            v[i] = temp;
        }
    }

    public static void ordemDecrescente(int[] v){
        int auxiliar;
        for(int i = 0; i < v.length-1;i++){
            for (int j = 0; j < v.length-1;j++){
                if (v[i] > v[j]){
                    auxiliar = v[i];
                    v[i] = v[j];
                    v[j] = auxiliar;

                }
            }
        }
    }

    public static void exibir(int[] v){
        for (int i = 0;i < v.length;i++){
            System.out.println("index:"+i+" "+v[i]);
        }
    }
}