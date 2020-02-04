package com.uniovi.sdi.blog;

public class Comentario {
	private String nombre;
	private String mensaje;

	public Comentario() {

	}

	public Comentario(String mensaje, String nombre) {
		this.mensaje = mensaje;
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
