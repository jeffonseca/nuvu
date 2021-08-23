package cc.nuvu.client.repository;

import cc.nuvu.client.model.ModelCreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCreditCard extends JpaRepository<ModelCreditCard, Long> {
}
