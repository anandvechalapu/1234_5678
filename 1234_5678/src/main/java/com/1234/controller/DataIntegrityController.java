package com.1234.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.1234.model.DataIntegrity;
import com.1234.service.DataIntegrityService;

@RestController
@RequestMapping("/dataIntegrity")
public class DataIntegrityController {

   @Autowired
   private DataIntegrityService dataIntegrityService;

   @GetMapping("/dataEntry/{dataEntry}")
   public List<DataIntegrity> getDataIntegrityByDataEntry(@PathVariable(value = "dataEntry") boolean dataEntry) {
      return dataIntegrityService.getDataIntegrityByDataEntry(dataEntry);
   }

   @GetMapping("/complete/{complete}/missing/{missing}")
   public List<DataIntegrity> getDataIntegrityByCompleteAndMissing(@PathVariable(value = "complete") boolean complete,
         @PathVariable(value = "missing") boolean missing) {
      return dataIntegrityService.getDataIntegrityByCompleteAndMissing(complete, missing);
   }
   
   @GetMapping("/date/{date}")
   public List<DataIntegrity> getDataIntegrityByDate(@PathVariable(value = "date") Date date) {
      return dataIntegrityService.getDataIntegrityByDate(date);
   }

   @PostMapping("/date/{date}/complete/{complete}/missing/{missing}")
   public void resetDataIntegrity(@PathVariable(value = "date") Date date, @PathVariable(value = "complete") boolean complete,
         @PathVariable(value = "missing") boolean missing) {
      dataIntegrityService.resetDataIntegrity(date, complete, missing);
   }

   @GetMapping("/download")
   public byte[] downloadDataIntegrityInExcelFormat() {
      return dataIntegrityService.downloadDataIntegrityInExcelFormat();
   }

}