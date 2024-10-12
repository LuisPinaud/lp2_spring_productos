package pe.com.cibertec.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.*;
import pe.com.cibertec.service.CategoriaService;
import pe.com.cibertec.service.ProductoService;
@Controller
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductoController {
	
	//private final ProductoService productoService = null;
	//private final CategoriaService categoriaService = null;
	@Autowired
	private  ProductoService productoService;
	@Autowired
	private  CategoriaService categoriaService;
	@GetMapping("/")
	public String listarProductos(Model model) {
		List<ProductoEntity> listaProducto = productoService.listarProducto();
		model.addAttribute("listaprod", listaProducto);
		return "lista_producto";
	}
	@GetMapping("/registrar_producto")
	public String mostrarRegistrarProducto(Model model) {
		List<CategoriaEntity> listaCategoria = categoriaService.obtenerTodasCategorias();
		model.addAttribute("categorias", listaCategoria);
		model.addAttribute("producto", new ProductoEntity());
		return "registrar_producto";
	}
	
	@PostMapping("registrar_producto")
	public String registrarProducto(@ModelAttribute("producto")ProductoEntity productoEntity,
			Model model) {
		productoService.crearProducto(productoEntity);
		return "redirect:/productos/";
	}
	
}
