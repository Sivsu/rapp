package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.contributors_by_month;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result home() {
        return ok(contributors_by_month.render(""));
    }
}