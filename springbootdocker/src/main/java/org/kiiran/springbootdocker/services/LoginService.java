package org.kiiran.springbootdocker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public Object[] getLoginDetails(LoginRequest loginRequest){
        String errorCode= "";
        LoginRequestEntity loginEntity  = loginDao.getUserNames(loginRequest);

        if(loginEntity == null){
            errorCode = "200";

        }else{
            errorCode = "500";
        }
        return  new Object[]{errorCode};
    }
}
