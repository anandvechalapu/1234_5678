package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.repository.DataEntryRepository;

@Service
public class DataEntryService {

   @Autowired
   DataEntryRepository dataEntryRepository;

   public List<DataEntry> findByDataIntegrity() {
      return dataEntryRepository.findByDataIntegrity();
   }

   public List<DataEntry> findByDataMissing() {
      return dataEntryRepository.findByDataMissing();
   }

   public List<DataEntry> findByManualEdit() {
      return dataEntryRepository.findByManualEdit();
   }

   public List<DataEntry> findByUpload() {
      return dataEntryRepository.findByUpload();
   }

   public List<DataEntry> findByUploadError() {
      return dataEntryRepository.findByUploadError();
   }

   public List<DataEntry> findByBranchVolumeUpload() {
      return dataEntryRepository.findByBranchVolumeUpload();
   }

}