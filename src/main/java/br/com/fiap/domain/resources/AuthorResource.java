package br.com.fiap.domain.resources;

import br.com.fiap.domain.entity.Author;
import br.com.fiap.domain.repository.AuthorRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/author")
public class AuthorResource {

    private AuthorRepository repo = new AuthorRepository();

    @GET
    public Response findAll() {
        List<Author> list = repo.findAll();
        return Response.ok( list ).build();
    }

}
