package alexrm84.hibernate.services;

import alexrm84.hibernate.entities.Task;
import alexrm84.hibernate.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public List<Task> findAll(Sort sort) {
        return taskRepository.findAll(sort);
    }

    public List<Task> findAllById(Iterable<String> iterable) {
        return taskRepository.findAllById(iterable);
    }

    public <S extends Task> List<S> saveAll(Iterable<S> iterable) {
        return taskRepository.saveAll(iterable);
    }

    public void flush() {
        taskRepository.flush();
    }

    public Task getOne(String s) {
        return taskRepository.getOne(s);
    }

    public <S extends Task> List<S> findAll(Example<S> example) {
        return taskRepository.findAll(example);
    }

    public <S extends Task> List<S> findAll(Example<S> example, Sort sort) {
        return taskRepository.findAll(example, sort);
    }

    public <S extends Task> S save(S s) {
        return taskRepository.save(s);
    }

    public Optional<Task> findById(String s) {
        return taskRepository.findById(s);
    }

    public boolean existsById(String s) {
        return taskRepository.existsById(s);
    }

    public long count() {
        return taskRepository.count();
    }

    public void deleteById(String s) {
        taskRepository.deleteById(s);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }
}
