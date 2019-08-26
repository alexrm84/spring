package alexrm84.hibernate;

import alexrm84.hibernate.config.AppConfig;
import alexrm84.hibernate.entities.Project;
import alexrm84.hibernate.entities.Task;
import alexrm84.hibernate.entities.User;
import alexrm84.hibernate.services.ProjectService;
import alexrm84.hibernate.services.TaskService;
import alexrm84.hibernate.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainAppHibernate {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectService projectService = context.getBean(ProjectService.class);
        final TaskService taskService = context.getBean(TaskService.class);
        final UserService userService = context.getBean(UserService.class);

//        Project project = new Project("1","Learning spring");
//        Task task = new Task("1", "Lesson4HW", project);
//        User user = new User("1", "alexrm84", "123");
//        user.setTask(task);
//        projectService.save(project);
//        taskService.save(task);
//        userService.save(user);



    }
}
