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
public class realExamAccess implements examAccess{

    @Override
    public void giveExam(String name) {
        System.out.println(name + " is allowed for exam");
    }
    
}
