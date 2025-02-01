package com.mycompany.server.resources;



import javax.ws.rs.*;
import javax.ws.rs.core.*;
import models.Operation;

@Path("/calc") // Endpoint: http://localhost:8080/Server/api/calc
public class CalculatorResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculate(Operation operation) {
        try {
            double result = calculateResult(operation);
            return Response.ok("{\"result\": " + result + "}").build();
        } catch (Exception e) {
            return Response.status(400).entity("{\"error\": \"" + e.getMessage() + "\"}").build();
        }
    }

    private double calculateResult(Operation op) {
        switch (op.getOperator()) {
            case "+": return op.getNum1() + op.getNum2();
            case "-": return op.getNum2() - op.getNum2();
            case "*": return op.getNum1() * op.getNum2();
            case "/": 
                if (op.getNum2() == 0) throw new ArithmeticException("Division par zéro");
                return op.getNum1() / op.getNum2();
            default: throw new IllegalArgumentException("Opérateur non valide");
        }
    }
}