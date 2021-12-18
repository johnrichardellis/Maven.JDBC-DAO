package daos;

import java.util.List;

public interface CarsDAO<T> {

    T findById(int id);
    List<T> findAll();
    T update(T cars);
    T create(T cars);
    void delete(int id);
}