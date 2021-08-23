package cc.nuvu.client.repository;

import cc.nuvu.client.Constant;
import cc.nuvu.client.model.ModelClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryClient extends JpaRepository<ModelClient, Long> {

   
    Optional<ModelClient> findByDocumentNumber(String numberDocument);
}
