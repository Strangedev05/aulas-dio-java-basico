package edu.hanry.semana3prog;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T   ";
        
        switch (plano) {
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("Whats e Insta Grátis");
            }
            case "B": {
                System.out.println("100 min de ligação");
            }
        }
    }
}
