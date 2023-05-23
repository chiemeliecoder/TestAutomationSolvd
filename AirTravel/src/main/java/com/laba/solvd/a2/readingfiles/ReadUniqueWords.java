package com.laba.solvd.a2.readingfiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class ReadUniqueWords {

  /**
   * FileUtils provides methods for reading and writing to files, copying files and directories, deleting files and directories, and many other file-related tasks.
   *
   * StringUtils provides methods for working with strings, such as splitting strings, replacing substrings, checking if a string is blank or empty, and many other string-related tasks.
   *
   * Using these libraries can make your code more concise and easier to read, as you don't need to write custom methods to perform these tasks yourself.
   *
   * These libraries are part of the Apache Commons project, which is a collection of open-source Java libraries that provide reusable, general-purpose components for software development.*/
  public static void main(String[] args) {
    File putFile = new File("src/main/resources/airportInfo.txt"); //file with info
    File getFile = new File("src/main/resources/getFileInfo.txt") ; //file to write into
    try {
      String content = FileUtils.readFileToString(putFile, "UTF-8");
      Set<String> words = new HashSet<>(Arrays.asList(StringUtils.split(content))); //splits a String into an array of substrings and vice versa

      String result = "Number of unique words: " + words.size(); //size of word
      FileUtils.writeStringToFile(getFile, result, "UTF-8"); //send it to new file
      System.out.println(result); //debug print result
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
