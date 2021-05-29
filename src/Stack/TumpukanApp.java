/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author UserPCC
 */
public class TumpukanApp {

    public static void main(String[] args) {
        Tumpukan stack = new Tumpukan(5);
        stack.push(50);
        stack.baca();
        stack.push(100);
        stack.baca();
        stack.pop();
        stack.baca();
        stack.push(60);
        stack.baca();
        stack.push(80);
        stack.baca();
        stack.pop();
        stack.baca();
        long nilai = stack.peek();
        System.out.println("nilai top = " + nilai);

        System.out.println();
        System.out.println("    Maulana Alamsyah");
        System.out.println("***** Terimakasih *****");
    }
}
