/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryteste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 02338079698
 */
public class testeFile {
    public static void main(String[] args) {
        try { 
            Scanner entrada = new Scanner( new File("c://"));
              
        } catch (FileNotFoundException ex) {
            Logger.getLogger(testeFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
