package com.example.demo.ports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PortService {

    @Autowired
    private PortRepository portRepository;

    public List<Port> findAll(){
        return (List<Port>) portRepository.findAll();
    }
    public Port findById(Long id){
        try {
            return (Port) portRepository.findById(id).get();
        }
        catch(NoSuchElementException ignored){
            return portRepository.findById(0L).get();
        }
    }
}
