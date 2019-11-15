package org.sagass.api.associados;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("associados")
public class AssociadosApi {

	
	class TesteClass {
		
		TesteClass(String teste1, String teste2) {
			
			this.teste1 = teste1;
			this.teste2 = teste2;
			
		}
		
		public String getTeste1() {
			return teste1;
		}

		public void setTeste1(String teste1) {
			this.teste1 = teste1;
		}

		public String getTeste2() {
			return teste2;
		}

		public void setTeste2(String teste2) {
			this.teste2 = teste2;
		}

		private String teste1;
		private String teste2;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response teste() {
		return Response.ok(new TesteClass("teste1", "teste2")).build();
	}
}
