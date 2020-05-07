import model.Camera

fun main(args: Array<String>){

    val camera =  Camera();
    camera.setCameraStatus(true);
    println( camera.getCameraStatus() )
    camera.setResolution(1080)
    println( "La resolucion de la camara es: ${ camera.getResolution() }")

}