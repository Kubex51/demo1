package com.example.demo.ports;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRepository extends CrudRepository<Port, Long> {
}
