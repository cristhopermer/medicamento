package control;

import java.util.Vector;
import manejadorarchivos.Procesadorarchivo;
import modelo.Medicamentos;

public class MedicamentosController {
    private Vector<Medicamentos>medicamentos = new Vector ();
    private Vector<Medicamentos>medicamentosPC = new Vector ();
    private Vector<Medicamentos>medicamentosLJ = new Vector ();

   
    public void agregarMedicamentos(Vector<Medicamentos>am){
        Procesadorarchivo pa= new Procesadorarchivo();
        System.out.print("s");
        try{
            pa.LeerDatos();
            System.out.print(pa.recuperarContenido());
        }catch(Exception ex) {
           
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
  
    
    

            

            

