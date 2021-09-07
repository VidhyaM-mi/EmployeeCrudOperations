package com.curdoperations.CrudOperations;
import lombok.*;

@Builder
@AllArgsConstructor
@Data
public class Employee {
   public  String eid;
   private String name;
   private String email;
   private String contact;
}