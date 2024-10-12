package pe.com.cibertec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.model.ProductoEntity;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Integer> {

}
