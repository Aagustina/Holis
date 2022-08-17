package clases;

public enum Rol {
	ADMINISTRADOR_DEL_SISTEMA("Administrador del sistema", "", 1, Funcionalidad.COMPRAS, Funcionalidad.VENTAS,
			Funcionalidad.CUENTAS_CORRIENTES),
	JEFE_DE_SECCION("Jefe de Sección", "contadores, jefes, etc", 2),
	OPERADOR_DE_SECCION("Operador de sección", "vendedor, archivista, reponedor, etc", 3);

	private String nombre;
	private String descripcion;
	private int id;
	private Funcionalidad[] funcionalidades;

	private Rol(String nombre, String descripcion, int id, Funcionalidad... funcionalidades) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.funcionalidades = funcionalidades;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getId() {
		return id;
	}

	public Funcionalidad[] getFuncionalidades() {
		return funcionalidades;
	}
}
