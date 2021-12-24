/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpatterns;

import java.util.HashMap;

/**
 *
 * @author maaz
 */
public class examAccessProxy implements examAccess{

    realExamAccess obj = new realExamAccess();
    static HashMap<String, Integer> stdData = new HashMap<>();
    static{
        stdData.put("Maaz", 90);
        stdData.put("Ahmad", 48);
    }

    @Override
    public void giveExam(String name) {
        int marks = stdData.get(name);
        //System.out.println(marks);
        if(marks < 50){
            System.out.println(name + " is not allowed for the exam");
        }
        else{
            obj.giveExam(name);
        }
    }    
}
