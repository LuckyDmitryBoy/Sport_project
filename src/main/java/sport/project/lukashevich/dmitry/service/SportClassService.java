package sport.project.lukashevich.dmitry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sport.project.lukashevich.dmitry.dao.SportDAO;
import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.entity.Footbal;
import sport.project.lukashevich.dmitry.entity.Volleyball;

import java.util.List;

@Service
public class SportClassService implements SportService{
    @Autowired
    private SportDAO sportDAO;

    @Override
    @Transactional
    public List<Footbal> getFootball() {
        return sportDAO.getFootball();
    }

    @Override
    @Transactional
    public List<Chess> getChess() {
        return sportDAO.getChess();
    }

    @Override
    @Transactional
    public List<Volleyball> getVolleyball() {
        return sportDAO.getVolleyball();
    }
    @Override
    @Transactional
    public void saveChess(Chess chess) {
        sportDAO.saveChess(chess);
    }

    @Override
    @Transactional
    public void saveFootball(Footbal footbal) {
        sportDAO.saveFootball(footbal);
    }

    @Override
    @Transactional
    public void saveVolleyball(Volleyball volleyball) {
     sportDAO.saveVolleyball(volleyball);
    }

    @Override
    @Transactional
    public Chess getChess(int id) {
        return sportDAO.getChess(id);
    }

    @Override
    @Transactional
    public Footbal getFootball(int id) {
        return sportDAO.getFootball(id);
    }

    @Override
    @Transactional
    public Volleyball getVolleyball(int id) {
        return sportDAO.getVolleyball(id);
    }

    @Override
    @Transactional
    public void deleteChess(int id) {
        sportDAO.deleteChess(id);
    }

    @Override
    @Transactional
    public void deleteFootball(int id) {
        sportDAO.deleteFootball(id);
    }

    @Override
    @Transactional
    public void deleteVolleyball(int id) {
        sportDAO.deleteVolleyball(id);
    }
}
