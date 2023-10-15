package br.com.gabrielrossi.todolist.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity createUser(@RequestBody UserModel userModel){
        var user = this.userRepository.findByUserName(userModel.getUserName());

        if(user != null){
            System.out.println("user ja existe!");
            //mensagem de erro 
            //status code

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("user ja existe");
        }

        var passwordHashed = BCrypt.withDefaults()
        .hashToString(12, userModel.getPassWord().toCharArray());

        userModel.setPassWord(passwordHashed);


        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
