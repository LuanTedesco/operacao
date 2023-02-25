package br.edu.unoesc.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.calculadora.Calculadora;
import br.edu.unoesc.calculadora.Operacao;
import br.edu.unoesc.conversor.ConversorNumerico;



@RestController
public class OperacaoController {
	
	private Logger logger = Logger.getLogger(OperacaoController.class.getName());
	
	@GetMapping("/somar-query")
    public Double somarQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.SOMAR);
    }
    
    @GetMapping(value = "/somar-path/{numero1}/{numero2}")
    public Double somarPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.SOMAR);
    }
    
    @GetMapping("/subtrair-query")
    public Double subtrairQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.SUBTRAIR);
    }
    
    @GetMapping(value = "/subtrair-path/{numero1}/{numero2}")
    public Double subtrairPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.SUBTRAIR);
    }
    
    @GetMapping("/multiplicar-query")
    public Double multiplicarQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.MULTIPLICAR);
    }
    
    @GetMapping(value = "/multiplicar-path/{numero1}/{numero2}")
    public Double multiplicarPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.MULTIPLICAR);
    }
    
    @GetMapping("/dividir-query")
    public Double dividirQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.DIVIDIR);
    }
    
    @GetMapping(value = "/dividir-path/{numero1}/{numero2}")
    public Double dividirPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.DIVIDIR);
    }
    
    @GetMapping("/media-query")
    public Double mediaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.MEDIA);
    }
    
    @GetMapping(value = "/media-path/{numero1}/{numero2}")
    public Double mediaPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.MEDIA);
    }
    
    @GetMapping("/potencia-query")
    public Double potenciaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") String numero2) {
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.POTENCIA);
    }
    
    @GetMapping(value = "/potencia-path/{numero1}/{numero2}")
    public Double potenciaPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	return Calculadora.operacao(numero1, numero2, Operacao.POTENCIA);

    }
    
    @GetMapping("/raizquadrada-query")
    public Double raizquadradaQuery(@RequestParam(value = "numero1", defaultValue = "0") String numero1) {
    	
    	return Calculadora.operacao(numero1, "0", Operacao.RAIZQUADRADA);
    }
    
    @GetMapping(value = "/raizquadrada-path/{numero1}")
    public Double raizquadradaPath(@PathVariable("numero1") String numero1) {
    	
    	return Calculadora.operacao(numero1, "0", Operacao.RAIZQUADRADA);
    }

}
