package com.example.dndavorionwikibackend.Service.CampaignService;

import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Repositories.CamapignRepository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    private SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {this.sessionRepository = sessionRepository;
    }

    public Session saveSession(Session session)throws Exception {

        Optional<Session> savedSession = Optional.ofNullable(sessionRepository.findSessionBySessionId(session.getSessionId()));
        if (savedSession.isPresent()) {
            throw new Exception("Session already exists with given name " + session.getSessionTitle());
        }
        return sessionRepository.save(session);
    }

    public List<Session> findAll() {
        return sessionRepository.findAll();
    }


    public Session getSessionBySessionId(long sessionId) {return sessionRepository.findSessionBySessionId(sessionId);
    }

    public void deleteSession(long sessionId) {
        sessionRepository.deleteById(sessionId);
    }
}
