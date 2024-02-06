package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
