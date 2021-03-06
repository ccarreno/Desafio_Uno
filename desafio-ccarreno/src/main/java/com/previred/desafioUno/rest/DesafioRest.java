/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.previred.desafioUno.rest;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.previred.desafioUno.exception.DesafioException;
import com.previred.desafioUno.rest.client.domain.PeriodosResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "desafio")
public interface DesafioRest {

    Logger log = LoggerFactory.getLogger(DesafioRest.class);

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Lista de periodos, incluyendo los faltantes", nickname = "desafio", notes = "", response = PeriodosResponse.class, tags = { "desafio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Periodo y lista de fechas", response = PeriodosResponse.class) })
    @GetMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<PeriodosResponse> desafio() throws DesafioException;

}
