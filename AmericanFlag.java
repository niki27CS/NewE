/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanflag;

/**
 *
 * @author Acer
 */
public class AmericanFlag {

    public static void main(String[] args) {
        //char Symbols [] = { '*' , '=' };
        char Flag[][] = new char[41][15];
        for(int j = 0; j < 9 ;j++){
            if(j%2==0){
                for(int i = 0; i < 6 ; i++) {
                    Flag[i][j] = '*';
                    System.out.print(Flag[i][j]);
                }
                for(int i = 34; i > 0 ; i--) {
                    Flag[i][j] = '=';
                    System.out.print(Flag[i][j]);
                }
                System.out.println();
           }
            else{
                for(int i = 0; i < 5 ; i++) {
                    Flag[i][j] = '*';
                    System.out.print(Flag[i][j]);
                }
                for(int i = 34; i > 0 ; i--) {
                    Flag[i][j] = '=';
                    System.out.print(Flag[i][j]);
                }
                System.out.println();
            }
        }
        for(int j = 0; j < 6; j++){
            for(int i = 0; i < 41 ; i++){
                Flag[i][j] = '=';
                System.out.print(Flag[i][j]);
            }
            System.out.println();
        }
    }
    
}
