package sec.project.config;
/**
 * Created by ugurilgin 
 */

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {

    public String encode(CharSequence rawPassword) {
        String answer = "";
        for(int i = 0; i < rawPassword.length(); i ++)
        {
            answer = answer + ((int)rawPassword.charAt(i));
        }
        return answer;
    }

    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        String encodedRaw = this.encode(rawPassword);
        if(encodedPassword.equals(encodedRaw))
            return true;
        else
            return false;
    }
}

