package com.pluralsight.conference.repositories;

import com.pluralsight.conference.model.Session;
import org.springframework.data.jpa.repository.Repository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}