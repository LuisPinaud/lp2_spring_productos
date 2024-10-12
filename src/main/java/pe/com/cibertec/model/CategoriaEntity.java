package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_categoria")
public class CategoriaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoria_id", nullable = false)
	private Integer categoriaId;
	@Column(name="nombre_categoria", nullable = false)
	private String nombreCategoria;
	public Integer getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public CategoriaEntity(Integer categoriaId, String nombreCategoria) {
		super();
		this.categoriaId = categoriaId;
		this.nombreCategoria = nombreCategoria;
	}
	public CategoriaEntity() {
		super();
	}
	
	
}
