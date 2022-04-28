package br.com.fiap.api.techBrasil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.api.techBrasil.entity.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long>{


}
