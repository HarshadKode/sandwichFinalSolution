package be.abis.sandwich.repository;

import be.abis.sandwich.model.SandwichOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandwichOrderDetailRepository extends JpaRepository<SandwichOrderDetail,Integer> {




}
