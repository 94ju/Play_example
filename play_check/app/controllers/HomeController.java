package controllers;

import play.mvc.*;


//import views.html.index;
//import views.html.Home.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {


        return ok("Hello i am coming sri lanka abc");
    }
    public Result about(){
        return ok("sri lanka won the match");
    }
    public Result check(){
        return ok("I am checking");
    }
//    public Result welcome(String name){
//        return ok(welcome().r);
//    }

}
