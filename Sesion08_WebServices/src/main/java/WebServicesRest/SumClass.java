package WebServicesRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Operaciones")
public class SumClass {

	@GET
	@Path("/Romanos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response result(
            @QueryParam("num1") int number1,
            @QueryParam("num2") int number2) {

        int result = number1 + number2;
        String romanNumber = convertToRoman(result);

        return Response.ok(romanNumber).build();
    }

    private String convertToRoman(int number) {
        if (number < 1 || number > 10) {
            return "Out of range";
        }

        String[] romanDigits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanDigits[number];
    }
}
