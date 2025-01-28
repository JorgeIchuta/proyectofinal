
package Interfaz;


class Electronico extends NoPerecedero {
    private String sistemaOperativo;
    private String material;

    public Electronico(String nombre, double precio,String marca, String sistemaOperativo, String material) {
        super(nombre, precio, marca);
        this.sistemaOperativo = sistemaOperativo;
        this.material = material;
    }
    
    @Override
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public String getMaterial() {
        return material;
    }
   
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Sistema Operativo: "+sistemaOperativo);
        System.out.println("Material: "+material);
    }

    
}
