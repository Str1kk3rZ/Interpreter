/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_interpreter;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Interpreter{

        public static void main(String [] args)

        {

                // Creamos el arbol de expresiones y el contexto

                ArrayList tree = new ArrayList();

                Contexto context = new Contexto();



                // Añadimos los tokens pasados como argumentos

                for(String token : args)

                {

                        if(context.getInteger(token) >= 0)

                                tree.add(new ExpresionNumerica(token));

                        else

                                tree.add(new OperacionDeExpresion(token));

                }



                // Interpretamos cada expresión

                for(Object e : tree)

                        e.interpret(context);



                // Mostramos el resultado

                System.out.println("El resultado de la interpretación es " + context.getResult());

        }

}

