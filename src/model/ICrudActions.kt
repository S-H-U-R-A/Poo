package model

interface ICrudActions {

     public fun create(): String

     public fun read(): String

     public fun update(): String

     public  fun delete(): String

     public fun saludar(msj: String){
          println("Este es tu mensaje: $msj")
     }

}