package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gamestore.models.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
}
