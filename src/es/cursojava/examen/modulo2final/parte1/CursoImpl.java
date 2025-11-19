package es.cursojava.examen.modulo2final.parte1;

public abstract class CursoImpl implements Curso{
	private String nombre;
	private String codigo;
	private int cupo;
	
	public CursoImpl(String nombre, String codigo, int cupo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupo = cupo;
	}

	@Override
	public String getNombreCurso() {
		
		return getNombre();
	}

	@Override
	public String getCodigoCurso() {
		return getCodigo();
	}

	@Override
	public int getCupoCurso() {
		// TODO Auto-generated method stub
		return getCupo();
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private int getCupo() {
		return cupo;
	}

	private void setCupo(int cupo) {
		this.cupo = cupo;
	}

}

