package spring.batch.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.batch.demo.model.MovimientoBanco;

public interface MovimientoBancoRepository extends JpaRepository<MovimientoBanco, Integer> {

}
