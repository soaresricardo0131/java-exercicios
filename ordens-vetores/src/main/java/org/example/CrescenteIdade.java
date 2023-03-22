package org.example;

public class CrescenteIdade {

    public static void main(String[] args) {

        String[] nomes = {"maria","antonio","ana","joao","carolina"};
        int[] idades = {37,26,48,44,41};

        System.out.println("ALEATORIO");
        exibir(idades, nomes);
        System.out.println("\n");
        System.out.println("ORDEM CRESCENTE");
        ordemCrescenteIdade(idades,nomes);
        exibir(idades, nomes);

    }

    public static void ordemCrescenteIdade(int[] idade, String[] nome){

        for (int i = 0;i < idade.length-1;i++ ){

            int menor = i;
            for (int j = i+1; j <idade.length;j++){

                if (idade[j] < idade[menor]){
                    menor = j;
                }
            }
            int tempI;
            String tempN;
            tempI = idade[menor];
            tempN = nome[menor];

            idade[menor] = idade[i];
            nome[menor] = nome[i];
            idade[i] = tempI;
            nome[i] = tempN;

        }
    }

    public static void exibir(int[] idade, String[] nome){
        for (int i = 0;i < idade.length;i++){

            System.out.println("nome: "+nome[i]+" | idade: "+idade[i]);
        }
    }
}
