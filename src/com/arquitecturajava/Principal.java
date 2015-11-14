package com.arquitecturajava;

public class Principal {

	public static void main(String[] args)
	{
		Empresa c= Empresa.getEmpresa("Nit: 1.024.569.852", "Andrww Sport","Ferreira producciones","Autopista Sur 35 12","3152658945");
		 
		 System.out.println(c.getNit());
		 System.out.println(c.getNombre());
		 System.out.println(c.getRazon());
		 System.out.println(c.getDireccion());
		 System.out.println(c.getTelefono());
		
	}
}
