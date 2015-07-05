package ch.rasc.mycustomer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

import ch.rasc.mycustomer.entity.Customer;

public interface CustomerRepository
		extends JpaRepository<Customer, Long>, QueryDslPredicateExecutor<Customer> {

	@Override
	List<Customer> findAll(Predicate predicate, OrderSpecifier<?>... orders);

	@Override
	List<Customer> findAll(Predicate predicate);
}
