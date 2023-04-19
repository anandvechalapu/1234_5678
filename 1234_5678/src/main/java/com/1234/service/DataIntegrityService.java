package com.1234.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.model.DataIntegrity;
import com.1234.repository.DataIntegrityRepository;

@Service
public class DataIntegrityService {
 
   @Autowired
   private DataIntegrityRepository dataIntegrityRepository;
 
   public List<DataIntegrity> getDataIntegrityByDataEntry(boolean dataEntry) {
      return dataIntegrityRepository.findByDataEntry(dataEntry);
   }
 
   public List<DataIntegrity> getDataIntegrityByCompleteAndMissing(boolean complete, boolean missing) {
      return dataIntegrityRepository.findByCompleteAndMissing(complete, missing);
   }
 
   public List<DataIntegrity> getDataIntegrityByDate(Date date) {
      return dataIntegrityRepository.findByDate(date);
   }
 
   public void resetDataIntegrity(Date date, boolean complete, boolean missing) {
      dataIntegrityRepository.resetDataIntegrity(date, complete, missing);
   }
 
   public byte[] downloadDataIntegrityInExcelFormat() {
      return dataIntegrityRepository.downloadDataIntegrityInExcelFormat();
   }
}