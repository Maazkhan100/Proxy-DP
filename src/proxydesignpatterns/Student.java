/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpatterns;

/**
 *
 * @author maaz
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Maaz";
        String name2 = "Ahmad";
        examAccess obj = new examAccessProxy();
        obj.giveExam(name1);
        obj.giveExam(name2);
    }
    
}
