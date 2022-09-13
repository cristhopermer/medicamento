package manejadorarchivos;

import java.util.ArrayList;
import modelo.Medicamentos;

public class baseDatos {
    ArrayList <Medicamentos> listaMedicamentos=new ArrayList<>();
    
    public void adicionarNombreEnBaseDatos(Medicamentos objNombre){
        listaMedicamentos.add(objNombre);
        
    }
    
}
