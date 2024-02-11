package moduloCronograma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moduloCronograma.model.CronogramaFatura;
import moduloCronograma.model.LocalidadeCiclo;




@Repository
public interface CronogramaFaturaRepository extends JpaRepository<CronogramaFatura,LocalidadeCiclo> {

	List<CronogramaFatura> findByLocalidadeCiclo_CodLocalidadeIn(List<Short> cdLocalidade);
}
