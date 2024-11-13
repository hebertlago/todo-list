package br.com.hebertlago.todolist.task;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaksRepository taksRepository;

    @PostMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel,  HttpServletRequest request){
        //System.out.println("Chegou no controller");
        var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID)idUser);
        var task = this.taksRepository.save(taskModel);
        return task;


    }
    
}