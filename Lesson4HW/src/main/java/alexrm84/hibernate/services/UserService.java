package alexrm84.hibernate.services;

import alexrm84.hibernate.entities.User;
import alexrm84.hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<User> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    public List<User> findAllById(Iterable<String> iterable) {
        return userRepository.findAllById(iterable);
    }

    public <S extends User> List<S> saveAll(Iterable<S> iterable) {
        return userRepository.saveAll(iterable);
    }

    public void flush() {
        userRepository.flush();
    }

    public User getOne(String s) {
        return userRepository.getOne(s);
    }

    public <S extends User> List<S> findAll(Example<S> example) {
        return userRepository.findAll(example);
    }

    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return userRepository.findAll(example, sort);
    }

    public <S extends User> S save(S s) {
        return userRepository.save(s);
    }

    public Optional<User> findById(String s) {
        return userRepository.findById(s);
    }

    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    public long count() {
        return userRepository.count();
    }

    public void deleteById(String s) {
        userRepository.deleteById(s);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}
