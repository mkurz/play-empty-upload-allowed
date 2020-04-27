package controllers;

import bodyparsers.CustomMultipartFormData;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class HomeController extends Controller {

    public Result index(final Http.Request req) {
        return ok(views.html.index.render(req));
    }

    @BodyParser.Of(CustomMultipartFormData.class)
    public Result upload(final Http.Request req) {
        return ok("files uploaded: " + req.body().asMultipartFormData().getFiles().size());
    }

}
