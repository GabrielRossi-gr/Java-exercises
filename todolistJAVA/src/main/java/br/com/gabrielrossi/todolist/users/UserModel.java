package br.com.gabrielrossi.todolist.users;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data //coloca getters e setters em todos os atributos
@Entity(name = "tb_users") //define entidade na tabela do banco de dados
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Getter @Setter //define getter e setter no atributo name 
    @Column(unique = true)
    private String name;
    private String userName;
    private String passWord;



    @CreationTimestamp
    private LocalDateTime createAT;
}
