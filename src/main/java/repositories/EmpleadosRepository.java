package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {

}
