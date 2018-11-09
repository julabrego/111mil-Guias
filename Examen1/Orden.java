package Examen1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Orden {
    private List<DetalleOrden> items;
    private int id;
    
    /* ####
    //private Date creacion;
    //private Date envio;   */
    private String creacion;
    private String envio;
    
    private float precioCantidad;
    private float sumaOrden = 0.0f;
    int i;
    
    public Orden(int id, String creacion){ // # public Orden(int id, Date creacion){
        this.id = id;
        this.creacion = creacion;
        items = new ArrayList<>();
    }
    
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    
    public int getNroItems(){
        return items.size();
    }
    
    public void setEnvio(String envio){ // #    public void setEnvio(Date envio){
        this.envio = envio;
    }

    /*
    public float calcularTotalOrden(Orden o){
        for(i=0; i==o.items.size(); i++ ){
            o.precioCantidad = o.items.get(i).getPrecioUnitario() * o.items.get(i).getCantidad();
            sumaOrden += o.precioCantidad;
        }

        return sumaOrden;
    }
*/
        public float CalcularTotalOrden(){
        float total = 0.0f;
        
        for (DetalleOrden o : items){
            total += (o.getPrecioUnitario() * o.getCantidad());
        }
        return total;
    }

}
