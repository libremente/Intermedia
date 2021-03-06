package it.extrasys.marche.regione.fatturapa.api.rest.exception.handler;

import it.extrasys.marche.regione.fatturapa.core.exceptions.FatturaPAConfigurazioneNonTrovataException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class FatturaPAConfigurazioneNonTrovataExceptionHandler implements ExceptionMapper<FatturaPAConfigurazioneNonTrovataException> {

    public Response toResponse(FatturaPAConfigurazioneNonTrovataException exception) {
        Response.Status status;

        status = Response.Status.NOT_FOUND;

        return Response.status(status).header("exception", exception.getMessage()).build();
    }

}
