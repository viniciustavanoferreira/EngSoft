/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Classe que define o modelo ~ Cargo.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 21/03/2018
 */
public class DocumentoLimitado extends PlainDocument{
    private int tamanhoMax = 10;
         
    public DocumentoLimitado(int tamanhoMax){
        this.tamanhoMax = tamanhoMax;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
 
            if (str == null) return;  
                    
             String stringAntiga = getText (0, getLength() );  
             int tamanhoNovo = stringAntiga.length() + str.length(); 
                        
             if (tamanhoNovo <= this.tamanhoMax) {  
                 super.insertString(offset, str , attr);  
             } else {    
                 super.insertString(offset, "", attr); 
             }  
    }    
}
