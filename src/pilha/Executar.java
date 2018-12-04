/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author afonso
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pilha p = new Pilha<Integer>(10);
        
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        
    
        p.imprimePilha();
        
        System.out.println("\n");
        
        p.remove();
        p.remove();
        
        System.out.println("\n");
        
        p.imprimePilha();
        
        System.out.println("\n");

        p.imprimeVetor();
         */

        //LISTA DE EXERCICIOS
        //Q1a();
        //Q1b();
        //Q1c(3);
        //Q1d(3);
        Q2("AAABCBAAB");
    }

    public static void Q1a() {
        Pilha p = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        p.remove();
        p.remove();
        p.insere(e);

    }

    public static void Q1b() {
        Pilha p = new Pilha<Integer>(10);
        int e = 100;
        Object aux;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        aux = p.remove();
        p.insere(e);
        p.insere(aux);
    }

    public static void Q1c(int n) {
        Pilha p = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        while (n != 0) {
            p.remove();
            n--;
        }
        p.insere(e);

    }

    public static void Q1d(int n) {
        Pilha p = new Pilha<Integer>(10);
        Pilha paux = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        while (n != 1) {
            paux.insere(p.remove());
            n--;
        }
        p.insere(e);
        while (!paux.estaVazia()) {
            p.insere(paux.remove());

        }

    }

    public static void Q1e() {
        Pilha p = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        while (!p.estaVazia()) {
            p.remove();
        }
        p.insere(e);

    }
    
    public static void Q1f(){
        Pilha p = new Pilha<Integer>(10);
        Pilha paux = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        while (!p.estaVazia()) {
            paux.insere(p.remove());
        }
        p.insere(e);
        while (!paux.estaVazia()) {            
            p.insere(paux.remove());
        }
    }
    
    public static void Q1g(){
        Pilha p = new Pilha<Integer>(10);
        Pilha paux = new Pilha<Integer>(10);
        int e = 100;
        p.insere(23);
        p.insere(64);
        p.insere(42);
        p.insere(70);
        while (!p.estaVazia()) {            
            paux.insere(p.remove());
        }
        p.insere(paux.remove());
        p.insere(paux.remove());
        p.insere(e);
        
        while (!paux.estaVazia()) {            
            p.insere(paux.remove());
        }
        
    }
    
    public static void Q2(String n){
        
        //PARA FAZER A QUESTÃO 3, É SOMENTE DAR UM SPLIT EM TODA A STRING COMPLETA, E ASSIM ELE VAI GERAR UM ARRAY DE STRINGS.
        //PEGA ESSE ARRAY DE STRINGS E FAZ UM LOOP NA QUANTIDADE DE VEZES QUE É FEITO SPLIT, NUMERO DE POSIÇÕES NO VETOR
        
        
        char[] s = n.toCharArray();
        Pilha p1 = new Pilha<Character>(s.length/2);
        Pilha p2 = new Pilha<Character>(s.length/2);
        int i = 0;
        while (!p1.estaCheia()) {   
            p1.insere(s[i]);
            i++;
        }
        i++;
        while (!p2.estaCheia()) {   
            p2.insere(s[i]);
            i++;
        }
        Pilha paux = new Pilha<Character>(s.length/2);
        while (!paux.estaCheia()) {            
            paux.insere(p2.remove());
        }
        boolean e = true;
        while (!p1.estaVazia()) {         
            if (p1.remove() != paux.remove()) {
                e = false;
            }
            i++;
        }
        if(e)
            System.out.println("PILHAS EQUIVALENTES");
        else
            System.out.println("PILHAS DIFERENTES");
    }
    
    public static void Q3(){
        
    }
    
    public static void Q4(){
        
    }
    
    public static void Q5(){
        Pilha estacionamento = new Pilha(10);
        Pilha p2 = new Pilha(10);
        
        
        
    }
    public static void Q6(){
        
    }
}
