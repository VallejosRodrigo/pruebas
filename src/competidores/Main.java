package competidores; //Necesitamos crear un paquete, donde depositar todas las clases

//Inicializar y crear objeto de cada competidor.
public class Main {

    public static void main(String[] args) {

        Atleta comp1 = new Atleta(); //crear objeto

        //metodos del objeto
        comp1.pedirDatos();
        comp1.sexo();
        comp1.cate();
        comp1.cateSegunPeso();
        comp1.mostrarDatos();

    }
}