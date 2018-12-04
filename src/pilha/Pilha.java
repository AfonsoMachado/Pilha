/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author afonso
 * @param <T>
 */
public class Pilha<T> {
      
    @SuppressWarnings("FieldMayBeFinal")
    private T[] pilha;
    private int fim;

    Pilha(int i) {
        this.pilha = (T[]) new Object[i];
        this.fim = -1;
    }
    
    public void insere(T valor){
        if (!estaCheia()) {
            this.pilha[++fim] = valor;
        }  
    }
    
    public T remove(){
        if(estaVazia())
            return (T) "A PILHA JÁ ESTÁ VAZIA!";
        T t = pilha[fim];
        pilha[fim] = null;
        fim--;
        System.out.println("ELEMENTO " + t + " DELETADO");
        return t;
    }
    
    public boolean estaVazia(){
        return fim == -1;
    }
    
    public boolean estaCheia(){
        if(fim == this.pilha.length - 1 ){
            System.out.println("PILHA CHEIA!");
            return true;
        }
        return false;
    }
    
    public void imprimeVetor(){
        for (int i = 0; i < pilha.length; i++) {
            System.out.println(pilha[i]);
        }
    }
    
    public void imprimePilha(){
        for (int i = 0; i <= fim; i++) {
            System.out.println(pilha[i]);
        }
    }
    
    public T[] getPilha() {
        return pilha;
    }

    public int getFim() {
        return fim;
    }
    
}
