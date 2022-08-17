package clases;

public enum Funcionalidad {
	CONTROL_DE_INVENTARIO("Control de Inventario", "", 1), VENTAS("Ventas", "", 2), COMPRAS("Compras", "", 3),
	CUENTAS_CORRIENTES("Cuentas Corrientes", "", 4), SUELDOS("Sueldos", "", 5);

	private int id;
	private String nombre;
	private String descripcion;

	private Funcionalidad(String nombre, String descripcion, int id) {
		this.nombre = nombre;
		this.descripcion = descripcion;
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
}
