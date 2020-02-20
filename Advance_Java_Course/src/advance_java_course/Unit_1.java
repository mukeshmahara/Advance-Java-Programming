/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java_course;

import java.io.FileWriter;

/**
 *
 * @author Dell
 */
class Learning_interface {

}

class Learning_inheritance {

}

class Learning_multithreading {

}

class Learning_Exception_handeling {

}

class Learning_file_read_write {

}

class Offemployee {

    int id, age, salary;
    String first_name, last_name, city;
    String phone;

    Offemployee() {

    }

    Offemployee(int id, int age, int salary, String first_name, String last_name, String city, String phone) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.first_name =first_name;
        this.last_name =last_name;
        this.city =city;
        this.phone = phone;
        
                
    }
}

public class Unit_1 {

    public static void main(String[] args) {
        Offemployee oe = new Offemployee(1, 23, 2000, "Rakesh", "Maharjan", "Kathmandu", "9868772852");
        try {
            FileWriter fw = new FileWriter("D:/text.txt");
            fw.write("id\t"+"Age\t"+"First Name\t"+"Last Name\t"+"City\t\t"+"Phone\t");
            fw.write("\n"+oe.id+"\t"+ +oe.age+"\t"+oe.first_name+"\t\t"+oe.last_name+"\t"+oe.phone+"\t"+oe.salary);
            fw.close();
            System.out.println("Check your file");
        } catch (Exception e) {
        }
    }

}
