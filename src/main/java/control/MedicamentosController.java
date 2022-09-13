package control;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import manejadorarchivos.Procesadorarchivo;
import modelo.Medicamentos;

public class MedicamentosController {
    private Vector<Medicamentos>medicamentos = new Vector ();
    private Vector<Medicamentos>medicamentosPC = new Vector ();
    private Vector<Medicamentos>medicamentosLJ = new Vector ();
    private List<String> baseDatos;

   
    public void agregarMedicamentos(Vector<Medicamentos>am){
        Procesadorarchivo pa= new Procesadorarchivo();
        try{
            pa.LeerDatos();
            baseDatos=(pa.recuperarContenido());
            cargarNombresDesdeBaseDatos(am);
        }catch(Exception ex) {
           Logger.getLogger(Procesadorarchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargarNombresDesdeBaseDatos(Vector<Medicamentos>am){
        
        String[] dato;
        for (int i=0; i < this.baseDatos.size(); i++ ){
            if (this.baseDatos.get(i) != null){
                String renglon = this.baseDatos.get(i);
                dato = renglon.split(",");
                am.add(new Medicamentos(dato[0],dato[1],dato[2],dato[3],dato[4],dato[5]));
                System.out.print(new Medicamentos(dato[0],dato[1],dato[2],dato[3],dato[4],dato[5]));
                }
            }
        }
    
    public  Medicamentos consultarMedicamentos(String c,Vector<Medicamentos>vm){
        Medicamentos me=null;
        for (int i=0; i <vm.size(); i ++){
            Medicamentos m=(Medicamentos) vm.get(i);
            if (m.getCodigo().equals(c)){
                me=m;break;
            }
        }
        return me;
    }
    
    public void eliminarMedicamentos (Medicamentos m,Vector<Medicamentos>vm){  
        vm.remove(m);
    }
   
    public Vector getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Vector medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * @return the medicamentosPC
     */
    public Vector<Medicamentos> getMedicamentosPC() {
        return medicamentosPC;
    }

    /**
     * @param medicamentosPC the medicamentosPC to set
     */
    public void setMedicamentosPC(Vector<Medicamentos> medicamentosPC) {
        this.medicamentosPC = medicamentosPC;
    }

    /**
     * @return the medicamentosLJ
     */
    public Vector<Medicamentos> getMedicamentosLJ() {
        return medicamentosLJ;
    }

    /**
     * @param medicamentosLJ the medicamentosLJ to set
     */
    public void setMedicamentosLJ(Vector<Medicamentos> medicamentosLJ) {
        this.medicamentosLJ = medicamentosLJ;
    }

    
    }
  
    
    

            

            

