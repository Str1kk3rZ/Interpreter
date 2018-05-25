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
public class ExpresionNumerica implements Expresion{
    
        private String value;



        public ExpresionNumerica(String token)

        {

                this.value = token;

        }

        public interpret(Contexto context)

        {

                context.setOperator(context.getInteger(this.value));

                context.calculate();

        }

}

