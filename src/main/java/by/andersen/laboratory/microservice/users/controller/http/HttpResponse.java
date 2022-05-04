package by.andersen.laboratory.microservice.users.controller.http;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
public class HttpResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss", timezone = "Europe/Minsk")
    private Date timeStamp;

    private int httpStatusCode;

    private HttpStatus httpStatus;

    private String message;

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String message) {
        this.timeStamp = new Date();
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.message = message;
    }


}
