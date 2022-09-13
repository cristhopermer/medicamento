package manejadorarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import modelo.Medicamentos;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class Procesadorarchivo {
    
  
    private List<String> basedatos = new ArrayList<String>();
    
    public void LeerDatos() throws IOException, Exception {
        String contenidoArchivo;
        int pos = 0;

        try {
            FileReader f = new FileReader("Farmacia.txt");
            BufferedReader b = new BufferedReader(f);

            while ((contenidoArchivo = b.readLine()) != null) {
                this.basedatos.add(contenidoArchivo);
                pos++;
            }
        } catch (FileNotFoundException ex) {
            throw new Exception(ex.getMessage());
        }
    }
    public void GuardarMedicamento(Vector<Medicamentos>listaMedicamentos)throws IOException, Exception {
 
        try {
            FileWriter f =new FileWriter("Farmacia.txt");
            BufferedWriter b = new BufferedWriter(f);         
            for (int x = 0; x < listaMedicamentos.size(); x++) {
                 Medicamentos lm =listaMedicamentos.get(x);
                 b.write(lm.getMedicamentos()+System.lineSeparator());
                 
            }
            b.close();
        } catch (FileNotFoundException ex) {
            throw new Exception(ex.getMessage());
        }     
        
   
    }
    public List<String> recuperarContenido() {
        return this.basedatos;
    }

    
}
