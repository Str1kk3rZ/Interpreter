/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_interpreter;

/**
 *
 * @author Hernan
 */
public class OperacionDeExpresion implements Expresion{
    private String operation;
    private final String operator;



        public OperacionDeExpresion(String token)

        {

                this.operator = token;

        }

        public interpret(Contexto context)

        {

                context.setOperation(this.operation);

                context.calculate();

        }

    @Override
    public void interpret(javax.naming.Context context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

