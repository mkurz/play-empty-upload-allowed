package bodyparsers;

import play.api.mvc.PlayBodyParsers;
import play.mvc.BodyParser;

import javax.inject.Inject;

public class CustomMultipartFormData extends BodyParser.MultipartFormData {

    @Inject
    public CustomMultipartFormData(final PlayBodyParsers playBodyParsers) {
        super(playBodyParsers, true);
    }
}
