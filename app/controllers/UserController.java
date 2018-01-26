package controllers;

import org.h2.store.fs.FileUtils;
import org.h2.util.IOUtils;
import play.Logger;
import play.api.Play;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

import static play.libs.Json.toJson;

import java.io.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import models.Book;
import models.User;

public class UserController extends Controller {
	
	private final FormFactory formFactory;
    private final JPAApi jpaApi;
	
    @Inject
	public UserController(FormFactory formFactory, JPAApi jpaApi) {
		this.formFactory = formFactory;
		this.jpaApi = jpaApi;
	}
	
    public Result newUser() {
    		return ok(views.html.newuser.render());
    }
    
	@Transactional
	public Result addUser() {
		User user = formFactory.form(User.class).bindFromRequest().get();
        System.out.println(user.toString());
        Date today = new Date(System.currentTimeMillis());
        user.postDate = today;
        jpaApi.em().persist(user);
        return redirect(routes.BookController.index());
	}
	
	@Transactional(readOnly=true)
	public Result getUsers() {
		List<User> users = (List<User>) jpaApi.em().createQuery("select p from User p").getResultList();
        return ok(toJson(users));
	}
}
