package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {

}
