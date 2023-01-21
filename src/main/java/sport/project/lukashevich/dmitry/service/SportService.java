package sport.project.lukashevich.dmitry.service;

import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.entity.Footbal;
import sport.project.lukashevich.dmitry.entity.Volleyball;

import java.util.List;

public interface SportService {
    public List<Footbal> getFootball();
    public List<Chess> getChess();
    public List<Volleyball> getVolleyball();
    public  void saveChess(Chess chess);
    public  void saveFootball(Footbal footbal);
    public  void saveVolleyball(Volleyball volleyball);
    public Chess getChess(int id);
    public Footbal getFootball(int id);
    public Volleyball getVolleyball(int id);
    public void deleteChess(int id);
    public void deleteFootball(int id);
    public void deleteVolleyball(int id);
}
