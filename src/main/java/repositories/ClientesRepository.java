package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
