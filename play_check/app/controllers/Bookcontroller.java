package controllers;
import play.mvc.*;
//import play.mvc.Result;
//import views.Home.*;
import views.html.index;

public class Bookcontroller extends Controller {
    //all books
    public Result index(){
        return ok("I am indexxxx");
    }
    //to create books
    public Result create(){
        return ok("I am create");
    }

    public Result edit (Integer id){
        return TODO;
    }
    //to save books
    public Result save(){
        return TODO;
    }

    public Result update(){
        return TODO;
    }
    public Result destroy(Integer id){
        return TODO;
    }
    public Result show (Integer id){
        return TODO;
    }

}
