package com.1234.service;

import com.1234.model.ExecutiveMemos;
import com.1234.repository.ExecutiveMemosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExecutiveMemosService {
 
    @Autowired
    private ExecutiveMemosRepository executiveMemosRepository;
 
    public List<ExecutiveMemos> findByMemo(String memo) {
        return executiveMemosRepository.findByMemo(memo);
    }
 
    public List<ExecutiveMemos> findByDateCreated(String dateCreated) {
        return executiveMemosRepository.findByDateCreated(dateCreated);
    }
 
    public List<ExecutiveMemos> findByDow(String dow) {
        return executiveMemosRepository.findByDow(dow);
    }
 
    public void deleteByMemo(String memo) {
        executiveMemosRepository.deleteByMemo(memo);
    }
 
    public List<ExecutiveMemos> findByAccess(boolean access) {
        return executiveMemosRepository.findByAccess(access);
    }
 
    public List<ExecutiveMemos> findByFieldNameAndDescriptionPrompt(String fieldName, String descriptionPrompt) {
        return executiveMemosRepository.findByFieldNameAndDescriptionPrompt(fieldName, descriptionPrompt);
    }
 
}