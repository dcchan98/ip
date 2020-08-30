
import java.time.LocalDate;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * manages user interfacce interactions
 */
public class Ui {

    /**
     * creates line
     *
     * @return a string of line
     */
    public String horizontalRule() {
        String myLine = "____________________________________________________________";
       // System.out.println(myLine);
        return myLine;
    }

    /**
     * A cool duke image
     *
     * @return string of a Duke image
     */
    public String greeting() {
        String logo = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";
      //  System.out.println("Hello from\n" + logo);
        return logo;


    }

    public void print(String myStr){
        System.out.println(myStr);
    }


}



