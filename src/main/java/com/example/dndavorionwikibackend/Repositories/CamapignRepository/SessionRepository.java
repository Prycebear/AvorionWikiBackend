package com.example.dndavorionwikibackend.Repositories.CamapignRepository;

import com.example.dndavorionwikibackend.Model.Campaign.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Session findSessionBySessionId(long sessionId);

    Set<Session> findSessionsBySessionId(long campaignId);
}
