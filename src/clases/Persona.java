package clases;

import java.util.Date;

public class Persona {
	private String documento;
	private String apellido1;
	private String apellido2;
	private String nombre1;
	private String nombre2;
	private Date fechaNac;
	private String clave;
	private String mail;
	private Rol rol;

	public Persona(String documento, String apellido1, String apellido2, String nombre1, String nombre2, Date fechaNac,
			String clave, String mail, Rol rol) {
		super();
		this.documento = documento;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.fechaNac = fechaNac;
		this.clave = clave;
		this.mail = mail;
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", fechaNac=" + fechaNac + ", clave=" + clave
				+ ", mail=" + mail + ", rol="+ rol +"]";
	}
}
