/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads_in_Java;

/**
 *
 * @author Dell
 */
public class Multi_Thread_Java implements Runnable {

    public static void main(String[] args) {
        Thread Multi_Thread_Java1 = new Thread("Guru1");
        Thread Multi_Thread_Java2 = new Thread("Guru2");
        Multi_Thread_Java1.start();
        Multi_Thread_Java2.start();
        System.out.println("Thread names are following:");
        System.out.println(Multi_Thread_Java1.getName());
        System.out.println(Multi_Thread_Java2.getName());

    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
