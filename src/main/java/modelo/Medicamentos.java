package modelo;

public class Medicamentos {
    
    private String codigo;
    private String nombre;
    private String forma;
    private String fechaC;
    private String viaconsumo;
    private String dosis;

    public Medicamentos() {
        
    }
    public String getMedicamentos(){
        String total=this.codigo+", "+ this.nombre + ", "+this.forma+", "+this.fechaC+", "+this.viaconsumo+", "+this.dosis;
        return total;
    
    }

    public Medicamentos(String codigo, String nombre, String forma, String fechaC, String viaconsumo, String dosis) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.forma = forma;
        this.fechaC = fechaC;
        this.viaconsumo = viaconsumo;
        this.dosis = dosis;
    } 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public String getViaconsumo() {
        return viaconsumo;
    }

    public void setViaconsumo(String viaconsumo) {
        this.viaconsumo = viaconsumo;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
     
}
