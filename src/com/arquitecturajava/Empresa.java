package com.arquitecturajava;

public class Empresa {

	 private String Nit;
	 private String Nombre;
	 private String Razon;
	 private String Direccion;
	 private String Telefono;
	 private static Empresa miempresa;
	 
	 public static Empresa getEmpresa(String Nit,String Nombre,String Razon,String Direccion, String Telefono) 
	 {
	 
	 if (miempresa==null) 
	 {
	 
	 miempresa=new Empresa(Nit, Nombre, Razon, Direccion, Telefono);
	 }
	 return miempresa;
	 }
	 
	 private Empresa(String Nit,String Nombre,String Razon,String Direccion, String Telefono)
	 {
	 
	 this.Nit=Nit;
	 this.Nombre=Nombre;
	 this.Razon=Razon;
	 this.Direccion=Direccion;
	 this.Telefono=Telefono;
	 
	 }

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getRazon() {
		return Razon;
	}

	public void setRazon(String razon) {
		Razon = razon;
	}



}
