/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author sjcet
 */
public class Employe {
    int empid,a;
    float salary,c;
    String name, b;
    Employe(int a,String b,float c)
    {
    empid = a;
    name =  b;
    salary=c;
        
    }
    public void salary() {
        float t_salary= salary+((salary*20)/100);
        System.out.println("total salary is"+t_salary);
    
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employe s1=new Employe(738,"jacob",10000);
        Employe s2=new Employe(837,"janteen",20000);
        s1.salary();
        s2.salary();
        
        
        
        // TODO code application logic here
    }
    
}
