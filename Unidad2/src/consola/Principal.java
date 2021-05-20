package consola;

import logica.*;

public class Principal {

	public static void main(String[] args) {

    //uso generico de UnaClase
    /*UnaClase ob2=new UnaClase(); 
    
    
   
    UnaClase ob1 =new UnaClase(par1, par2);
    
    //; //Declaración del objeto ob1
    ob1=new UnaClase(par1, par2);  //instancia del objeto ob1


    //Creación e instancia del objeto ob2
	  ob1=new UnaClase(par1, par2);  
    //par1 es un parámetro de tipo tipo1 y par2 es de tipo tipo2
    

		//uso el método set
    ob1.setAtributo1(p1);
		ob1.setAtributo2(p2);

    //uso del método get
    tipo1 var1=ob1.getAtributo1();
		
    //uso el método toString
		System.out.println("Los datos de  ob1 son:"+ob1.toString() );
    */
    /*************************************************/
		Alumno a=new Alumno();  //cree el objeto Alumno
		Alumno b=new Alumno("Ruiz",2,2000);
		
		a.setApellido("Perez");
		a.setGrupo(4);
		a.setCuotaBase(1000);
		
		System.out.println("El alumno a es:"+a.toString() );
		System.out.println("El alumno b es: "+b.toString());

    Fecha f1 =new Fecha(12,3,2000);
    System.out.println("La fecha fue cargada con:"+f1.toString() );

    Automovil a1=new Automovil();
		Automovil a2=new Automovil("Fiat",10000,2015);
		//System.out.println("a1 tiene-> \n"+a1.toString());
		System.out.println("\na2 tiene-> \n"+a2.toString());
		System.out.println("La marca de a2 es: "+a2.getMarca());
		a2.setMarca("Ford");
		System.out.println("La marca de a2 es: "+a2.getMarca());
		a1.setMarca("Honda");
		a1.setPrecio(12000);
		a1.setAnio(2015);
		System.out.println("a1 tiene-> \n"+a1.toString());
		double valorImpuesto=a1.impuesto();
		System.out.println("El impuesto de a1 es:"+valorImpuesto);
		
		
	}

}