package alexrm84.hibernate.services;

import alexrm84.hibernate.entities.Project;
import alexrm84.hibernate.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public List<Project> findAll(Sort sort) {
        return projectRepository.findAll(sort);
    }

    public List<Project> findAllById(Iterable<String> iterable) {
        return projectRepository.findAllById(iterable);
    }

    public <S extends Project> List<S> saveAll(Iterable<S> iterable) {
        return projectRepository.saveAll(iterable);
    }

    public void flush() {
        projectRepository.flush();
    }

    public Project getOne(String s) {
        return projectRepository.getOne(s);
    }

    public <S extends Project> List<S> findAll(Example<S> example) {
        return projectRepository.findAll(example);
    }

    public <S extends Project> List<S> findAll(Example<S> example, Sort sort) {
        return projectRepository.findAll(example, sort);
    }

    public <S extends Project> S save(S s) {
        return projectRepository.save(s);
    }

    public Optional<Project> findById(String s) {
        return projectRepository.findById(s);
    }

    public boolean existsById(String s) {
        return projectRepository.existsById(s);
    }

    public long count() {
        return projectRepository.count();
    }

    public void deleteById(String s) {
        projectRepository.deleteById(s);
    }

    public void deleteAll() {
        projectRepository.deleteAll();
    }
}
