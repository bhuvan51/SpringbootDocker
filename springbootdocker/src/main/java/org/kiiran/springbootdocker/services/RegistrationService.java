//package org.kiiran.springbootdocker.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RegistrationService {
//
//    @Autowired
//    RegistrationDao registrationDao;
//
//    public Object[] getregistrationdetails(RegistrationRequest registrationRequest){
//
//        String errorCode= "";
//        RegistrationRequestEntity requestEntity  = registrationDao.getUserNames(registrationRequest);
//
//        if(requestEntity == null){
//            errorCode = "200";
//            RegistrationRequestEntity registrationRequestEntity = registrationDao.InsertUserRegistration(registrationRequest);
//        }else{
//            errorCode = "500";
//        }
//        return  new Object[]{errorCode};
//    }
//}
//
