package competidores; //Necesitamos crear un paquete, donde depositar todas las clases
import java.util.Scanner; //Se requiere de esta libreria para pedir datos por Scanner.

public class Atleta<genero> { /*En esta clase podemos simular un programa
para inscripcion de un torneo orientado al Brazilian Jiu jitsu.
 */

    //Atributos de la clase:
    String nombreYapellido, dni, colorFaixa, academia, categoria, absoluto, genero, catGenero, email, mestre, catePeso;
    float peso;
    int grau, edad;

    //Metodos de la clase:
    public void pedirDatos() {
        Scanner l = new Scanner(System.in);

        System.out.println("\nIngrese su nombre y apellido: ");
        nombreYapellido = l.nextLine();

        System.out.println("Ingrese su DNI: ");
        dni = l.nextLine();

        System.out.println("Ingrese su edad (solo numeros): ");
        edad = Integer.parseInt(l.nextLine());

        System.out.println("Ingrese su peso en KG (solo numeros): ");
        peso = Integer.parseInt(l.nextLine());

        System.out.println("Ingrese su genero: ");
        genero = l.nextLine();

        System.out.println("Ingrese su e-mail: ");
        email = l.nextLine();

        System.out.println("Ingrese el color de su faixa ");
        colorFaixa = l.nextLine();
        System.out.println("Ingrese numero de grados (ej: 0, 1, 2, 3 o 4): ");
        grau = Integer.parseInt(l.nextLine());

        System.out.println("Ingrese el nombre de su academia: ");
        academia = l.nextLine();

        System.out.println("Nombre del mestre: ");
        mestre = l.nextLine();

        System.out.println("¿Absoluto? si/no ");
        absoluto = l.nextLine();
    } //Metodo para obtener todos los datos requeridos del usuario.

    public void cate() {
        if ((edad > 0) && (edad < 18)) {
            categoria = "Juvenil";
        } else {
            if (edad < 31) {
                categoria = "Adulto";
            } else {
                if (edad < 36) {
                    categoria = "Master 1";
                } else {
                    if (edad < 41) {
                        categoria = "Master 2";
                    } else {
                        categoria = "Master 3";
                    }
                }
            }
        }
    } //Organiza las categorias segun la EDAD "años" ingresado por el usuario.

    public void sexo() {
        switch (genero) {
            case "masculino":
                catGenero = "Masculino";
                break;
            case "Masculino":
                catGenero = "Masculino";
                break;
            case "MASCULINO":
                catGenero = "Masculino";
                break;
            case "hombre":
                catGenero = "Masculino";
                break;
            case "Hombre":
                catGenero = "Masculino";
                break;
            case "varon":
                catGenero = "Masculino";
                break;
            case "Varon":
                catGenero = "Masculino";
                break;
            case "VARON":
                catGenero = "Masculino";
                break;
            case "m":
                catGenero = "Masculino";
                break;
            case "M":
                catGenero = "Masculino";
                break;
            case "femenino":
                catGenero = "Femenino";
                break;
            case "Femenino":
                catGenero = "Femenino";
                break;
            case "FEMENINO":
                catGenero = "Femenino";
                break;
            case "Femenina":
                catGenero = "Femenino";
                break;
            case "femenina":
                catGenero = "Femenino";
                break;
            case "FEMENINA":
                catGenero = "Femenino";
                break;
            case "mujer":
                catGenero = "Femenino";
                break;
            case "MUJER":
                catGenero = "Femenino";
                break;
            case "Mujer":
                catGenero = "Femenino";
                break;
            case "chica":
                catGenero = "Femenino";
                break;
            case "Chica":
                catGenero = "Femenino";
                break;
            case "CHICA":
                catGenero = "Femenino";
                break;
            case "F":
                catGenero = "Femenino";
                break;
            case "f":
                catGenero = "Femenino";
                break;
            default:
                System.out.println("Usted no ingresó su genero correctamente. ");
                break;
        }


    } //Switch diseñado para filtrar diferentes tipos de tipeos por el usuario para lograr solamente 2 posibles resultados. "Masculino" o "Femenino"

    public void cateSegunPeso() {
        if (catGenero == "Masculino") {
            if ((peso > 0) && (peso <= 57.50)) {
                catePeso = "GALO";
            } else {
                if (peso <= 64) {
                    catePeso = "PLUMA";
                } else {
                    if (peso <= 70) {
                        catePeso = "PENA";
                    } else {
                        if (peso <= 76) {
                            catePeso = "LEVE";
                        } else {
                            if (peso <= 82.30) {
                                catePeso = "MEDIO";
                            } else {
                                if (peso <= 88.30) {
                                    catePeso = "MEDIO PESADO";
                                } else {
                                    if (peso <= 94.30) {
                                        catePeso = "PESADO";
                                    } else {
                                        if (peso <= 100.50) {
                                            catePeso = "SUPER PESADO";
                                        } else {
                                            if (peso < 250) {
                                                catePeso = "PESADISIMO";
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        } else {
            if (catGenero == "Femenino") {
                if ((peso > 0) && (peso <= 53.50)) {
                    catePeso = "PLUMA";
                } else {
                    if (peso <= 58.50) {
                        catePeso = "PENA";
                    } else {
                        if (peso <= 64) {
                            catePeso = "LEVE";
                        } else {
                            if (peso <= 69) {
                                catePeso = "MEDIO";
                            } else {
                                if (peso <= 74) {
                                    catePeso = "MEDIO PESADO";
                                } else {
                                    if (peso <= 250) {
                                        catePeso = "PESADO";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    } //Organiza las categorias segun el PESO "kg" ingresado por el usuario.

    public void mostrarDatos(){
        System.out.println("\n||||| USTED SE HA REGISTRADO CORRECTAMENTE |||||\n");
        System.out.println(nombreYapellido);
        System.out.println("DNI: "+dni);
        System.out.println("EDAD: "+edad+" años");
        System.out.println("CATEGORIA: "+categoria);
        System.out.println("PESO: "+peso+" kg");
        System.out.println("CATEGORIA PESO: "+catePeso);
        System.out.println("GENERO: "+catGenero);
        System.out.println("FAIXA: "+colorFaixa+" con "+grau+" grados");
        System.out.println("E-MAIL: "+email);
        System.out.println("ACADEMIA: "+academia);
        System.out.println("MESTRE: "+mestre);
        System.out.println("¿Absoluto?: "+absoluto);
        System.out.println("\n******************************************************\n");
    } //Metodo para mostrar datos en pantalla al usuario.
}

/*
FALTA

 -Agregar pesaje de juveniles, entre otros metodos.
 -Cambiar metodos a funciones (diferente de void, que retornen y tengan parametros).
 -Corregir "if anidados"
 -
 */