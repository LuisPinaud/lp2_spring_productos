package pe.com.cibertec.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_producto")
public class ProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id", nullable = false)
	private Integer productoId;
	
	@Column(name = "nombre_producto", nullable = false)
	private String nombreProducto;
	
	@Column(name = "precio", nullable = false)
	private Double precio;
	
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@Column(name = "fecha_vencimiento", nullable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaVencimiento; // LocalDate yyyy-mm-dd || LocalDateTime yyyy-mm-dd hh:mm:ss
	
	@ManyToOne
	@JoinColumn(name = "fk_categoria", nullable = false)
	private CategoriaEntity categoriaEntity;

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public CategoriaEntity getCategoriaEntity() {
		return categoriaEntity;
	}

	public void setCategoriaEntity(CategoriaEntity categoriaEntity) {
		this.categoriaEntity = categoriaEntity;
	}

	public ProductoEntity(Integer productoId, String nombreProducto, Double precio, Integer cantidad,
			LocalDate fechaVencimiento, CategoriaEntity categoriaEntity) {
		super();
		this.productoId = productoId;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.fechaVencimiento = fechaVencimiento;
		this.categoriaEntity = categoriaEntity;
	}

	public ProductoEntity() {
		super();
	}
	
	
}
