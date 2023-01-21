package sport.project.lukashevich.dmitry.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.entity.Footbal;
import sport.project.lukashevich.dmitry.entity.Volleyball;

import java.util.List;
@Repository
public class SportClassDAO implements SportDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Footbal> getFootball() {
        Session session= sessionFactory.getCurrentSession();
        List<Footbal> footbalList=session.createQuery("from Footbal",Footbal.class).getResultList();
        return footbalList;
    }

    public List<Chess> getChess() {
    Session session= sessionFactory.getCurrentSession();
    List<Chess> chessList=session.createQuery("from Chess",Chess.class).getResultList();
    return chessList;
    }

    public List<Volleyball> getVolleyball() {
    Session session= sessionFactory.getCurrentSession();
    List<Volleyball> volleyballList=session.createQuery("from Volleyball",Volleyball.class).getResultList();
    return volleyballList;
    }

    public void saveChess(Chess chess) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(chess);
    }


    public void saveFootball(Footbal footbal) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(footbal);
    }


    public void saveVolleyball(Volleyball volleyball) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(volleyball);
    }

    @Override
    public Chess getChess(int id) {
        Session session=sessionFactory.getCurrentSession();
        Chess chess=session.get(Chess.class,id);
        return chess;
    }

    @Override
    public Footbal getFootball(int id) {
        Session session=sessionFactory.getCurrentSession();
        Footbal footbal=session.get(Footbal.class,id);
        return footbal;
    }

    @Override
    public Volleyball getVolleyball(int id) {
        Session session=sessionFactory.getCurrentSession();
        Volleyball volleyball=session.get(Volleyball.class,id);
        return volleyball;
    }

    @Override
    public void deleteChess(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query<Chess> query=session.createQuery("delete from Chess "+"where id=:chId");
        query.setParameter("chId",id);
        query.executeUpdate();
    }

    @Override
    public void deleteFootball(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query<Footbal> query=session.createQuery("delete from Footbal "+"where id=:fotId");
        query.setParameter("fotId",id);
        query.executeUpdate();
    }

    @Override
    public void deleteVolleyball(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query<Volleyball> query=session.createQuery("delete from Volleyball "+"where id=:volId");
        query.setParameter("volId",id);
        query.executeUpdate();
    }
}
