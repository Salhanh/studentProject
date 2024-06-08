/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author hetal
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1= new student();
        s1.setName("Hetal");
        s1.setAge(20);
        
         student s2= new student();
        s2.setName("Sanya");
        s2.setAge(21);
        
         student s3= new student();
        s3.setName("Nandan");
        s3.setAge(19);
        
        student[] list =new student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for (int i=0; i<list.length ; i++){
            System.out.println("Name: "+list[i].getName()+" | Age: "+ list[i]. getAge());
        }
        
        
        
        
        
    }
    
}
