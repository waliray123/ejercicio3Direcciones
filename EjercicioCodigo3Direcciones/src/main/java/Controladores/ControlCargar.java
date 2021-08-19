/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Analizadores.ErrorCom;
import Analizadores.LexerCompilar;
import Analizadores.ParserCompilar;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author user-ubunto
 */
public class ControlCargar {
    
    public void iniciar(){
        try {            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Archivo de Texto", "txt"));
            fileChooser.setAcceptAllFileFilterUsed(false);
            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == APPROVE_OPTION) {                                
                controlLoad(fileChooser.getSelectedFile().getPath());                                
            } 
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Info", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void controlLoad(String path){
        String texto = "";              
        try {            
            FileReader fileReader = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader);
            String line;            
            while((line=br.readLine())!=null){
                texto+=line+"\n";
            }     
            Compilar(texto);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void Compilar(String texto){
        try {            
            List<ErrorCom> errores = new ArrayList<>();
            StringReader reader = new StringReader(texto);
            LexerCompilar lexico = new LexerCompilar(reader);
            ParserCompilar parser = new ParserCompilar(lexico);
            try {
                parser.parse();
                errores = parser.getErroresCom();                
            } catch (Exception ex) {
                System.out.println("Error irrecuperable");
                System.out.println("Causa: " + ex.getCause());
                System.out.println("Causa2: " + ex.toString());
            }
            if (errores.size() > 0) {
                JFReporteErrores jfReporteErrores = new JFReporteErrores(errores);
                jfReporteErrores.setVisible(true);                
            } else {                
                System.out.println("Compilado Correctamente");
            }
        } catch (Exception e) {

        }
    }
}
