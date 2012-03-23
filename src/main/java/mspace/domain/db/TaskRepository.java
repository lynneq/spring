package mspace.domain.db;

import mspace.domain.Task;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class TaskRepository {

    private SessionFactory sessionFactory;

    public TaskRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public TaskRepository(){

    }

    @Transactional
    public Task create(Task task){
        String id = (String)this.sessionFactory.getCurrentSession().save(task);
        return (Task) this.sessionFactory.getCurrentSession().load(Task.class, id);
    }

}
