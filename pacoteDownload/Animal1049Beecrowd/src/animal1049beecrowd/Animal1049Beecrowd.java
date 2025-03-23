/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal1049beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Animal1049Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String categoria = teclado.nextLine();
        String grupo = teclado.nextLine();
        String alimentacao = teclado.nextLine();
        
        if (categoria.equals("vertebrado")){
            if (grupo.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    System.out.println("aguia");
                } if (alimentacao.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } if (grupo.equals("mamifero")) {
                if (alimentacao.equals("onivoro")) {
                    System.out.println("homem");
                } if (alimentacao.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } if (categoria.equals("invertebrado")) {
            if (grupo.equals("inseto")) {
                if (alimentacao.equals("hematofago")) {
                    System.out.println("pulga");
                } if (alimentacao.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } if (grupo.equals("anelideo")) {
                if (alimentacao.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } if (alimentacao.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
    
}
