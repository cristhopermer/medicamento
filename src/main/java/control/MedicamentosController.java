package control;

import java.util.Vector;
import modelo.Medicamentos;

public class MedicamentosController {
    private Vector<Medicamentos>medicamentos = new Vector ();

     public MedicamentosController(){
         getMedicamentos();
     }
    
    public void AgregarMedicamentos(Medicamentos m){
        getMedicamentos().add(m);
    }
    public  Medicamentos consultarMedicamentos(String c){
        Medicamentos me=null;
        for (int i=0; i <getMedicamentos().size(); i ++){
            Medicamentos m=(Medicamentos) getMedicamentos().get(i);
            if (m.getCodigo().equals(c)){
                me=m;break;
            }
        }
        return me;
    }
    public void eliminarMedicamentos (Medicamentos m){  
        medicamentos.remove(m);
    }
    public Medicamentos consultar(String cod){
        Medicamentos me=null;
        for(Medicamentos m:medicamentos){
            if(m.getCodigo().equals(cod)){
                me=m;break;
            }
            
        }
        return me;
    }

    public Vector getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Vector medicamentos) {
        this.medicamentos = medicamentos;
    }
    
}
            

            

