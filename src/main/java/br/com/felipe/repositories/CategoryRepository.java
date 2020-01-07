package br.com.felipe.repositories;


import br.com.felipe.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer> {

    @Override
    List<Category> findAll();

    @Override
    List<Category> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<Category> findById(Integer integer);

    @Override
    Page<Category> findAll(Pageable pageable);
}
