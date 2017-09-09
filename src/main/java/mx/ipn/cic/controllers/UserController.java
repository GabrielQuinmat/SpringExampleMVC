package mx.ipn.cic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.ipn.cic.model.User;
import mx.ipn.cic.services.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * @return path a JSP
	 **/
	@RequestMapping(value = "/newUserForm")
	public String getNewUserForm() {
		return "user/new_user";
	}

	/**
	 * Obtiene formulario para modificación de usuario
	 * 
	 * @param id
	 *            identificador de usuario
	 * @return path a JSP requerido
	 */
	@RequestMapping(value = "/{id}/modifyForm")
	public String getModifyForm(@PathVariable long id, Model model) {
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "user/modify_form";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getAll(Model model) {
		List<User> users = userService.getAll();
		model.addAttribute("users", users);

		return "user/all";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getById(@PathVariable long id, Model model) {
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "user/single_user";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String newRegister(User user) {
//		 User user = new User(name, lastName, age);
		 userService.create(user);
		 System.out.println(userService.getAll());
//		 model.addAttribute("message", "Usuario: " + user.getId() + "creado.");
		return "user/ok";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String modifyRegister(@PathVariable long id, String name,
			String lastName, int age) {
		User user = userService.getById(id);
		if (user != null) {
			user.setName(name);
			user.setLastName(lastName);
			user.setAge(age);
			userService.update(user);
		}
		return "user/ok";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteRegister(@PathVariable long id) {
		userService.delete(id);
		return "user/ok";
	}

}