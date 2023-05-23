package com.laba.solvd.A8.FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EasyFileReading {
  public static void main(String[] args) throws IOException {

    File file = new File("src/main/resources/putfile.txt");
    FileReader fileReader = null;

    BufferedReader bufferedReader = null;

    try{
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);

      String content;

      while ((content = bufferedReader.readLine()) != null) {
        System.out.println(content);
      }
    }finally{
      if(bufferedReader != null)
        bufferedReader.close();

      if(fileReader != null)
        fileReader.close();

    }

  }

}
