package cm.belrose.SpringBootExceptionHandle.services;

import cm.belrose.SpringBootExceptionHandle.entities.Employe;
import cm.belrose.SpringBootExceptionHandle.exception.EmployeServiceException;
import cm.belrose.SpringBootExceptionHandle.exception.ResourceNotFoundException;

import java.util.Optional;

public interface EmployeService {
    public Optional<Employe> findEmplyeById(Long id) throws ResourceNotFoundException, EmployeServiceException;
}
