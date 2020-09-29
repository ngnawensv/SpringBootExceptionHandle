package cm.belrose.SpringBootExceptionHandle.services;

import cm.belrose.SpringBootExceptionHandle.dao.EmployeDao;
import cm.belrose.SpringBootExceptionHandle.entities.Employe;
import cm.belrose.SpringBootExceptionHandle.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
    EmployeDao employeDao;

    @Override
    public Optional<Employe> findEmplyeById(Long id) throws ResourceNotFoundException {

            Optional<Employe> employeFound = employeDao.findById(id);
            if (employeFound.isEmpty()) {
                throw new ResourceNotFoundException("Employee with id "+id+" inexistant");
            }
            return employeFound;

    }
}
