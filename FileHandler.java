/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment.system.aviv.zikel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class FileHandler {
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    
    public FileHandler(String filename) throws IOException {
        fw = new FileWriter(filename,true);
        bw = new BufferedWriter(fw);
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
    }
    
    public ArrayList read() throws IOException{
        String line ="";
        ArrayList lines = new ArrayList();
        while(line != null) {
            line = this.br.readLine();
            lines.add(line);
        }
        return lines;
    }
    
    public void write(String text) throws IOException {
        this.bw.write(text);
        this.bw.newLine();
        this.bw.flush();

    }
    
}
