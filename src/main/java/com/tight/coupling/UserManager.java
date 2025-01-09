package com.tight.coupling;

public class UserManager {
        private UserDatabase userDatabse = new UserDatabase();

        public String getUserInfo(){
            return userDatabse.getUserDetails();
        }
    }

