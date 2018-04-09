package dev.exemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.exemple.Exemple;

public interface ExempleRepository extends JpaRepository<Exemple, Integer> {
}