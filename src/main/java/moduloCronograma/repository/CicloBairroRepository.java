package moduloCronograma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moduloCronograma.model.CicloBairro;

@Repository
public interface CicloBairroRepository extends JpaRepository<CicloBairro,Long>{

	List<CicloBairro>findByCdBairroAndCdCidade(Short cdBairro,Short cdCidade);
	List<CicloBairro>findByCdCidade(Short cdCidade);
}
