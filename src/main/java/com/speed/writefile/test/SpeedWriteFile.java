package com.speed.writefile.test;

import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;

public class  SpeedWriteFile {
	
  public static String wInFile(int nbr) {
    try {

     long startTime = System.nanoTime();
     File f = new File("filename1.txt");
     FileWriter w = new FileWriter(f);

     for(int i =1 ; i <nbr+1; i++){
     w.write("ligne  ...." + i + "\n");
     }
     
      w.close();
      long endTime = System.nanoTime();
      long time = endTime - startTime;
      
     return "Execution time in milliseconds : " + time / 1000000 + " \n temps en nanoseconds  : " + time +"\n pour une boocle de " + nbr;
      
      
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
  }



}
